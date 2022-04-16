package com.viso.mvc.service;

import com.viso.mvc.model.Stock;

import java.util.Map;

public interface StockPriceService {
    Map<String, String> getPrice(String user);
}
