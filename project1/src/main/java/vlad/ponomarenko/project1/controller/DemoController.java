package vlad.ponomarenko.project1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vlad.ponomarenko.project1.bean.FirstDemo;
import vlad.ponomarenko.project1.bean.SecondDemo;

@Controller
public class DemoController {

    @RequestMapping("/controller")
    @ResponseBody
    public String thisIsController() {
        return "There may be a controller here";
    }

    @Qualifier("firstDemoBean")
    @Autowired
    private FirstDemo firstDemo;

    @Qualifier("secondDemoBean")
    @Autowired
    private SecondDemo secondDemo;


    @PostMapping("/firstSet")
    public void setNameFirst(@RequestBody String setFirst){
        firstDemo.setName(setFirst);
    }
    @GetMapping("/firstGet")
    public String getNameFirst(){
        return firstDemo.getName();
    }

    @PostMapping("/secondSet")
    public void setNameSecond(@RequestBody String setSecond){
        secondDemo.setName(setSecond);
    }
    @GetMapping("/firstGet")
    public String getNameSecond(){
        return secondDemo.getName();
    }
}
