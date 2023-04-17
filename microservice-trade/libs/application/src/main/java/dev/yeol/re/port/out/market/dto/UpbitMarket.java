package dev.yeol.re.port.out.market.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpbitMarket {

    String market;
    @JsonProperty("korean_name")
    String koreanName;
    @JsonProperty("english_name")
    String englishName;
    @JsonProperty("market_warning")
    Boolean marketWarning;


}
