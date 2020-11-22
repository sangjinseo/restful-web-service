package com.example.restfulwebservice.helloworld;

import com.example.restfulwebservice.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // Get
    // /hello-world (endPoint)
    // @RequestMapping(method=RequestMethod.GET , path="/hello-world")
    @GetMapping("/hello-world")
    public String HelloWorld() {
        return "Hello World";
    }

    // alt + enter , java bean  with lombok 으로 사용하여 반환하는 예제..
    @GetMapping("/hello-world-bean")
    public HelloWorldBean HelloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping("/hello-world-bean/path-variable/{name}")
    public HelloWorldBean HelloWorldBean(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s",  name));
    }
}
