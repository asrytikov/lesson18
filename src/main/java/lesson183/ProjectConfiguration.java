package lesson183;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"lesson183.proxies", "lesson183.repositories", "lesson183.services"})
public class ProjectConfiguration {
}
