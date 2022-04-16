package viso.reactive.service;

import reactor.core.publisher.Flux;
import viso.reactive.model.Stock;

public interface RStockService {
    Flux<Stock> getAllStocks();
}
