package dev.yeol.re.contract;

import org.springframework.http.HttpMethod;

public enum RestApiType {
    MARKET_ALL("/v1/market/all", HttpMethod.GET);

    private String uri;
    private HttpMethod httpMethod;

    RestApiType(String uri, HttpMethod httpMethod){
        this.uri = uri;
        this.httpMethod = httpMethod;
    }

    public String getUri() {
        return uri;
    }

    public HttpMethod getHttpMethod() {
        return httpMethod;
    }
}
