package com.viso.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.viso.jpa.entity.StockDO;

public interface StockDao extends JpaRepository<StockDO, String> {
    StockDO findBySymbol(String symbol);
}
