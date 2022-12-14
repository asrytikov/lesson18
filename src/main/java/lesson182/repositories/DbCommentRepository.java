package lesson182.repositories;

import lesson182.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DbCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment:" + comment.getText());
    }
}
