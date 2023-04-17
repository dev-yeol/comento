package dev.yeol.re.controller;

import dev.yeol.re.http.market.UpbitMarketHttpClient;
import dev.yeol.re.port.out.market.dto.UpbitMarket;
import dev.yeol.re.service.hello.HelloUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HelloController {

    private final HelloUseCase helloUseCase;
    private final UpbitMarketHttpClient upbitMarketHttpClient;
    public HelloController(HelloUseCase helloUseCase, UpbitMarketHttpClient upbitMarketHttpClient){
        this.helloUseCase = helloUseCase;
        this.upbitMarketHttpClient = upbitMarketHttpClient;
    }

    @GetMapping("/hello")
    public String helloApi(){
        return helloUseCase.getHello();
    }

    @GetMapping("/api/v1/market/all")
    public List<UpbitMarket> marketAll(){
        return upbitMarketHttpClient.marketAll();
    }

}
