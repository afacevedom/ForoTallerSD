package forotallersd

class File {
    String fileType
    byte[] content
    double size

    static constraints = {
        fileType matches: "[a-zA-Z]+\/[a-zA-Z]+", nullable: false, blank: false
        content nullable:false, blank:false
        size max: 10000000, nullable: false, blank: false
    }
}
