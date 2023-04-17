package dev.yeol.re.http.market.builder;

import dev.yeol.re.contract.RestApiType;
import dev.yeol.re.http.builder.RestApiBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

@Component
public class UpbitMarketAllBuilder implements RestApiBuilder {

    @Value("${http.upbit.base-url}")
    private String baseUrl;

    @Override
    public String buildUri() {
        return UriComponentsBuilder.fromUriString(baseUrl)
                .path(RestApiType.MARKET_ALL.getUri())
                .build()
                .toString();
    }

    @Override
    public HttpHeaders buildHeaders() {
        Map<String, String> attributes = new HashMap<>();
        attributes.put("accept", MediaType.APPLICATION_JSON_VALUE);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAll(attributes);
        return httpHeaders;
    }

    @Override
    public Boolean isTarget(RestApiType restApiType) {
        return restApiType == RestApiType.MARKET_ALL;
    }
}
