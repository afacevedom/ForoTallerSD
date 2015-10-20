package forotallersd

class Forum {
    String name
    Date dateCreated
    String category

    static constraints = {
        name (nullable: false, unique: true, minSize: 3, maxSize: 20)
        dateCreated (nullable: false, min: new Date())
        category (nullable: false, minSize: 3, maxSize: 15)
    }
}
