package dev.yeol.re.port.out.market;

import dev.yeol.re.port.out.market.dto.UpbitMarket;

import java.util.List;

public interface UpbitMarketClient {

    List<UpbitMarket> marketAll();

}
