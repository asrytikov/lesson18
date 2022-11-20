package lesson182.repositories;

import lesson182.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
