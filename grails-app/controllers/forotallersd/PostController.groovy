package forotallersd

class PostController {

    static  scaffold = Post

    def index() {
      def listPost = Post.list()
      [post:listPost]
    }
}
