package com.viso.mvc.controller;

import com.viso.mvc.model.StockSubscription;
import com.viso.mvc.model.StockSymbol;
import com.viso.mvc.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static com.viso.mvc.Constants.TEST_USER_EMAIL;

@Controller
@RequestMapping("/subscriptions")
public class SubscriptionController {
    @Autowired
    private SubscriptionService subscriptionService;

    @PostMapping
    public String addSubscription(@ModelAttribute(value = "stockSymbol") StockSymbol symbol) {
        String name = TEST_USER_EMAIL;
        subscriptionService.addSubscription(name, symbol.getSymbol());
        return "redirect:/subscriptions?added=" + symbol.getSymbol();
    }

    @GetMapping
    public String subscription(Model model) {
        String name = TEST_USER_EMAIL;
        List<StockSubscription> subscriptions = subscriptionService.findByEmail(name);
        model.addAttribute("email", name);
        model.addAttribute("subscriptions", subscriptions);

        return "subscription";
    }


}
