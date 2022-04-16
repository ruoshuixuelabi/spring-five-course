package com.viso.reactive.service;

import com.viso.reactive.dto.StockPrice;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public interface RStockPriceService {
    Flux<StockPrice> getPrice(String user);
}
