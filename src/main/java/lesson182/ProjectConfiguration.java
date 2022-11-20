package lesson182;

import lesson182.proxies.CommentNotificationProxy;
import lesson182.proxies.EmailCommentNotificationProxy;
import lesson182.repositories.CommentRepository;
import lesson182.repositories.DbCommentRepository;
import lesson182.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"lesson182.proxies", "lesson182.repositories", "lesson182.services"})
public class ProjectConfiguration {
}
