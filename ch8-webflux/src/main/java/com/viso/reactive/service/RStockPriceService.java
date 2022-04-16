package com.viso.reactive.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import com.viso.reactive.dto.StockPrice;

@Service
public interface RStockPriceService {
    Flux<StockPrice> getPrice(String user);
}
