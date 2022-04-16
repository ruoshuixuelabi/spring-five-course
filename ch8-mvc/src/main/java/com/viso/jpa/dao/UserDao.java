package com.viso.jpa.dao;

import com.viso.jpa.entity.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserDO, Long> {
    UserDO findByEmail(String email);
}
