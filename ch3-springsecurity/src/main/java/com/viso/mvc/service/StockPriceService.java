package com.viso.mvc.service;

import java.util.Map;

public interface StockPriceService {
    Map<String, String> getPrice(String user);
}
