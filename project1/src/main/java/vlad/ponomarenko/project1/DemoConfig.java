package vlad.ponomarenko.project1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import vlad.ponomarenko.project1.bean.FirstDemo;
import vlad.ponomarenko.project1.bean.SecondDemo;
import vlad.ponomarenko.project1.bean.ThirdDemo;

@Configuration
public class DemoConfig {

    @Bean
    public FirstDemo firstDemo(){
        return new FirstDemo();
    }
    @Bean
    @Scope("prototype")
    public SecondDemo secondDemo(){
        return new SecondDemo();
    }

    @Bean
    @Scope("singleton")
    public ThirdDemo thirdDemo(){
        return new ThirdDemo();
    }
}
