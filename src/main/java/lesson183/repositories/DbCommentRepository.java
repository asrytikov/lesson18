package lesson18.repositories;

import lesson18.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DbCommentRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment:" + comment.getText());
    }
}
