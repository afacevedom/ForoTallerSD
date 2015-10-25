package forotallersd

class Admin extends User {
    Integer level
    Double rating
	
	static hasMany = [forum:Forum]
	
    static constraints = {
        level (nullable: false, range: 1..5)
        rating (nullable: false, range: 0..100)
    }

	static mapping = {
		sort "level"
	}
}
