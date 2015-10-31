package forotallersd

class FileController {

    static  scaffold = File

    def index() {
      def listFile = File.list()
      [file:listFile]
    }
}
