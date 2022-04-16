package com.viso.reactive.service;

import com.viso.reactive.model.Stock;
import reactor.core.publisher.Flux;

public interface RStockService {
    Flux<Stock> getAllStocks();
}
