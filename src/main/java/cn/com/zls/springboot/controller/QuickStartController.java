package cn.com.zls.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickStartController {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private Integer age;

    @RequestMapping("/quick")
    public  @ResponseBody String quick(){
        return "springboot 访问成功 name="+name+",age="+age;
    }

}
