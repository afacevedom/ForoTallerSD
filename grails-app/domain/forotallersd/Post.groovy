package forotallersd

class Post {
    String topic
    Date dateCreated
    Date lastUpdate
    Boolean itsAllowed

    static hasMany = [owner_id : File]

    static belongsTo = [fatherForum_id : Forum, regular: Regular]

    def beforeInsert(){
        this.dateCreated = new Date()
    }

    def beforeUpdate(){
        this.lastUpdate = new Date()
    }

    def delete(){
        def posts = Post.get(this)
        def files = File.findAllByPost_belongs_id(posts)
        files*.delete()
        posts.delete()
    }

    static constraints = {
        topic (nullable: false, minSize: 3, maxSize: 50)
        dateCreated (nullable: false, min: new Date())
        lastUpdate (nullable: false, min: new Date())
        itsAllowed (nullable: false)
    }
}
