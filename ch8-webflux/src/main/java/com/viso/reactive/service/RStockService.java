package com.viso.reactive.service;

import reactor.core.publisher.Flux;
import com.viso.reactive.model.Stock;

public interface RStockService {
    Flux<Stock> getAllStocks();
}
