package lesson182;

import lesson182.model.Comment;
import lesson182.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var comment = new Comment();
        comment.setAuthor("Ivan");
        comment.setText("Hello");
        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
