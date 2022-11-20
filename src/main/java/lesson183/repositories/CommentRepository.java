package lesson183.repositories;

import lesson183.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
