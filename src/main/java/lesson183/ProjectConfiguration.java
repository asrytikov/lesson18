package lesson18;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"lesson18.proxies", "lesson18.repositories", "lesson18.services"})
public class ProjectConfiguration {
}
