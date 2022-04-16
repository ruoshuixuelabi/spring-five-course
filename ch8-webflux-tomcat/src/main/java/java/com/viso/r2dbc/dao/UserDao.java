package java.com.viso.r2dbc.dao;

import com.viso.r2dbc.entity.UserDO;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface UserDao extends ReactiveCrudRepository<UserDO, Long> {
    Mono<UserDO> findByEmail(String email);
}
