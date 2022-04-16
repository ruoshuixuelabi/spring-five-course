package com.viso.jpa.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "APP_ROLE")
@Data
@NoArgsConstructor
public class RoleDO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    public RoleDO(String name) {
        this.name = name;
    }
}
