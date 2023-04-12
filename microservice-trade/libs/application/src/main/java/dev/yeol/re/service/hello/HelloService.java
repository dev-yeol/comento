package dev.yeol.re.service.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements HelloUseCase{
    @Override
    public String getHello() {
        return "helloWorld";
    }
}
