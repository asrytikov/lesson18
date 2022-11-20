package lesson183.repositories;

import lesson183.model.Comment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class DbCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment:" + comment.getText());
    }
}
