package forotallersd

class RegularController {

    static scaffold = Regular

    def index() {
      def listRegular = Regular.list()
      [regular:listRegular]
    }
}
