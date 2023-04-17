package dev.yeol.re.http.market;

import dev.yeol.re.contract.RestApiType;
import dev.yeol.re.http.builder.RestApiBuilder;
import dev.yeol.re.port.out.market.UpbitMarketClient;
import dev.yeol.re.port.out.market.dto.UpbitMarket;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class UpbitMarketHttpClient implements UpbitMarketClient {

    private final RestTemplate restTemplate;
    private final List<RestApiBuilder> builders;

    public UpbitMarketHttpClient(RestTemplate restTemplate, List<RestApiBuilder> builders) {
        this.restTemplate = restTemplate;
        this.builders = builders;
    }

    @Override
    public List<UpbitMarket> marketAll() {
        RestApiType targetRestApiType = RestApiType.MARKET_ALL;


        RestApiBuilder restApiBuilder = builders.stream().findFirst()
                .orElseThrow();
        restApiBuilder.isTarget(targetRestApiType);
        return restTemplate.exchange(
                restApiBuilder.buildUri(),
                targetRestApiType.getHttpMethod(),
                new HttpEntity<>(restApiBuilder.buildHeaders()),
                new ParameterizedTypeReference<List<UpbitMarket>>(){}
        ).getBody();
    }
}
