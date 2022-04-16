package com.viso.mvc.controller;

import com.viso.mvc.model.StockSubscription;
import com.viso.mvc.service.StockPriceService;
import com.viso.mvc.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

import static com.viso.mvc.Constants.TEST_USER_EMAIL;
import static com.viso.mvc.Constants.TEST_USER_NAME;

@Controller
public class WebController {

    @Autowired
    private SubscriptionService subscriptionServiceImpl;

    @Autowired
    private StockPriceService stockPriceService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("email", TEST_USER_EMAIL);
        model.addAttribute("stockPrices", stockPriceService.getPrice(TEST_USER_EMAIL));
        return "index";
    }
}
