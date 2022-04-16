package com.viso.webtestclient;

import com.viso.reactive.controller.ApiController;
import com.viso.reactive.functional.RouterConfig;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.reactive.server.WebTestClient;

public class Demo1 {

    @Test
    public void bindToApiController() {
        WebTestClient client = WebTestClient.bindToController(new ApiController()).build();
        client.get().uri("/api/prices").exchange()
                .expectBody()
                .consumeWith(System.out::println);
    }

    @Test
    public void bindToRouterFunction() {
        WebTestClient client = WebTestClient.bindToRouterFunction(RouterConfig.apiRoute()).build();
        client.get().uri("/api/prices").exchange()
                .expectBody()
                .consumeWith(System.out::println);
    }
}
