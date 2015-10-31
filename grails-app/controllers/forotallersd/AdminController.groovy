package forotallersd

class AdminController {

    static scaffold = Admin

    def index() {
      def listAdmin = Admin.list()
      [admin:listAdmin]
    }
}
