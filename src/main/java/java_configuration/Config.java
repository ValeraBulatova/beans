package java_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {

    @Bean
    private static FirstJavaBean firstJavaBean() {
        return new FirstJavaBean();
    }
}
