package com.viso.reactive.controller;

import com.viso.reactive.model.Stock;
import com.viso.reactive.model.StockSymbol;
import com.viso.reactive.service.RStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;
import reactor.core.publisher.Flux;

@Controller
@RequestMapping("/stocks")
public class StockController {
    @Autowired
    private RStockService rStockService;

    @GetMapping
    private String getStocks(Model model) {
        Flux<Stock> stocks = rStockService.getAllStocks();
        model.addAttribute("stocks", new ReactiveDataDriverContextVariable(stocks));
        model.addAttribute("stockSymbol", new StockSymbol());
        return "stocks";
    }
}
