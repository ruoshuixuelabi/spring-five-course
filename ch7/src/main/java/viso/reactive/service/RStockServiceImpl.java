package viso.reactive.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import viso.r2dbc.dao.StockDao;
import viso.reactive.model.Stock;

@Service
@Slf4j
public class RStockServiceImpl implements RStockService {
    @Autowired
    private StockDao stockDao;

    @Override
    public Flux<Stock> getAllStocks() {
        return doGetAllStocks();
    }

    public Flux<Stock> doGetAllStocks() {
        log.info("do getAllStocks");
        return stockDao.findAll()
                .map(stockDO -> Stock.builder()
                        .symbol(stockDO.getSymbol())
                        .name(stockDO.getName())
                        .build()
                );
    }

}
