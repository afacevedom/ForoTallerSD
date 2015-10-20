package forotallersd

class File {
    String fileType
    Byte content
    Double size

    static constraints = {
        fileType (nullable: false, matches: '^([a-z-]+)/([a-z0-9.-]+)$')
        content (nullable: false)
        size (nullable: false, minSize: 0, maxSize: 10*1024*1024)
    }
}
