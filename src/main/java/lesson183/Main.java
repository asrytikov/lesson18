package lesson183;

import lesson183.model.Comment;
import lesson183.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        /*var commentRepository = new DbCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        var commentService = new CommentService(commentRepository, commentNotificationProxy);
        var comment = new Comment();
        comment.setAuthor("Ivan");
        comment.setText("Hello");

        commentService.publishComment(comment);*/

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var comment = new Comment();
        comment.setAuthor("Ivan");
        comment.setText("Hello");
        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
