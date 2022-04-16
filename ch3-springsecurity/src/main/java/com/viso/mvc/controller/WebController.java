package com.viso.mvc.controller;

import com.viso.mvc.model.StockSubscription;
import com.viso.mvc.service.StockPriceService;
import com.viso.mvc.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    private SubscriptionService subscriptionService;

    @Autowired
    private StockPriceService stockPriceService;

    @RequestMapping("/")
    public String index(Model model) {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        model.addAttribute("email", name);
        model.addAttribute("stockPrices", stockPriceService.getPrice(name));
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
