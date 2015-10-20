package forotallersd

class Regular extends User{
    Integer postViews
    Integer strikesNumber
    Integer starsNumber

    static constraints = {
        postViews(nullable: false, min: 0)
        strikesNumber (nullable: false, range: 0..3)
        starsNumber (nullable: false, range: 0..5)
    }
}
