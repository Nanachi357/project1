package vlad.ponomarenko.project1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BaseConfig {

    @Bean("list1")
    public List<String> list1() {
        var list1 = new ArrayList<String>();
        list1.add("test");
        return list1;
    }
}
