package forotallersd

class Post {
    String topic
    Date dateCreated
    Date lastUpdate
    Boolean itsAllowed
    
    static belongsTo = [regular:Regular]

    static constraints = {
        topic (nullable: false, minSize: 3, maxSize: 50)
        dateCreated (nullable: false, min: new Date())
        lastUpdate (nullable: false, min: new Date())
        itsAllowed (nullable: false)
    }
}
