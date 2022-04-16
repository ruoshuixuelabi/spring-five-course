package viso.reactive.service;

import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import reactor.core.publisher.Mono;
import viso.r2dbc.entity.UserDO;
import viso.reactive.dto.UserRegistration;

public interface RUserService extends ReactiveUserDetailsService {
    Mono<UserDO> save(UserRegistration registrationDto);
}
