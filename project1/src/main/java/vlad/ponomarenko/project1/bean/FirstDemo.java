package vlad.ponomarenko.project1.bean;

import org.springframework.stereotype.Component;

@Component("firstDemoBean")
public class FirstDemo {
    public String name;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void demo(){
        System.out.println("First Demo");
    }
}
