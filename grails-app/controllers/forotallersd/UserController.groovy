package forotallersd

class UserController {

    static scaffold = User
    def index() {
      def listUsers = User.list()
      [user:listUsers]
    }
}
