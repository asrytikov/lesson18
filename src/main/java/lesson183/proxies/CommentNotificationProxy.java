package lesson183.proxies;

import lesson183.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
