package com.viso.mvc.service;

import com.viso.jpa.entity.UserDO;
import com.viso.mvc.dto.UserRegistration;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    UserDO save(UserRegistration registrationDto);

    List<UserDO> getAll();
}
