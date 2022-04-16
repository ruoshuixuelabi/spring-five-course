package com.viso.reactive.service;

import com.viso.r2dbc.entity.UserDO;
import com.viso.reactive.dto.UserRegistration;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import reactor.core.publisher.Mono;

public interface RUserService extends ReactiveUserDetailsService {
    Mono<UserDO> save(UserRegistration registrationDto);
}
