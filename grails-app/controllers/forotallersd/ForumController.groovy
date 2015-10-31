package forotallersd

class ForumController {

    static scaffold = Forum

    def index() {
      def listForum = Forum.list()
      [forum:listForum]
    }
}
