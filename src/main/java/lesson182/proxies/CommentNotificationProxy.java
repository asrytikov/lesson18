package lesson182.proxies;

import lesson182.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
