package forotallersd

class User {
    String name
    String lastname
    Integer age
    String username
    String password

    static constraints = {
        name (blank: false, nullable: false, size: 3..50)
        lastname (blank: false, nullable: false, size: 3..50)
        age (blank: false, nullable: false, min: 14)
        username (blank: false, nullable: false, unique: true)
        password (blank: false, nullable: false, password: true, minSize: 8, matches: '^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$')
    }
}
