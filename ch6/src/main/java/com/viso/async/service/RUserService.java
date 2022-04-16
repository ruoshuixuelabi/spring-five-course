package com.viso.async.service;

import com.viso.jpa.entity.UserDO;
import com.viso.mvc.dto.UserRegistration;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public interface RUserService extends UserDetailsService {
    Future<UserDO> saveAsync(UserRegistration registrationDto);

    CompletableFuture<UserDO> save(UserRegistration registrationDto);

    Future<List<UserDO>> getAllAsync();

    CompletableFuture<List<UserDO>> getAll();
}
