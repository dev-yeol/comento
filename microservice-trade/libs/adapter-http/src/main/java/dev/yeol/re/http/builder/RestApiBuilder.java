package dev.yeol.re.http.builder;

import dev.yeol.re.contract.RestApiType;
import org.springframework.http.HttpHeaders;


public interface RestApiBuilder {

    String buildUri();
    HttpHeaders buildHeaders();
    Boolean isTarget(RestApiType restApiType);
}
