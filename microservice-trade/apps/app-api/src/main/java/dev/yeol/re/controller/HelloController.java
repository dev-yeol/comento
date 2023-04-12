package dev.yeol.re.controller;

import dev.yeol.re.service.hello.HelloUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    private final HelloUseCase helloUseCase;

    public HelloController(HelloUseCase helloUseCase){
        this.helloUseCase = helloUseCase;
    }

    @GetMapping("/hello")
    public String helloApi(){
        return helloUseCase.getHello();
    }

}
