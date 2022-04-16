package java.com.viso.r2dbc.dao;

import com.viso.r2dbc.entity.StockSubscriptionDO;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface StockSubscriptionDao extends ReactiveCrudRepository<StockSubscriptionDO, Long> {
    Flux<StockSubscriptionDO> findByEmail(String email);

    Flux<StockSubscriptionDO> findByEmailAndSymbol(String email, String symbol);
}
