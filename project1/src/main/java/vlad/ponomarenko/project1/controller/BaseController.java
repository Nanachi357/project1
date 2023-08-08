package vlad.ponomarenko.project1.controller;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
import vlad.ponomarenko.project1.bean.BaseService;

import java.util.List;

@RestController
public class BaseController {

    private final BaseService baseService;
    private final List<String> list1;

    public BaseController(BaseService baseService,
                          @Qualifier("list1") List<String> list1 ) {
        this.baseService = baseService;
        this.list1 = list1;
    }

    @PostConstruct
    void setUp() {
        System.out.println(baseService.currentTime());
        System.out.println(list1);
    }

    //1. create beans: @Configuration and @Bean, @Component, @Service, @Controller
    //2. create beans with diff scopes: singleton, prototype etc.
    //3. start application in Debug mode, check context (Actuator -> Beans)
    //4. create 2 beans with 2 diff names and inject them by names

    //5. init git repository
    //6. create branches
    //7. make commit
    //8. push commit
    //9. pull request & merge

    //10. IDEA - DB (Spring JPA, ORM, JDBC), WEB (Spring MVC, RESTful API), TEST (JUnit - Unit Tests, Integration tests)

}
