package lesson18.repositories;

import lesson18.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
