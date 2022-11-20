package lesson18.proxies;

import lesson18.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
