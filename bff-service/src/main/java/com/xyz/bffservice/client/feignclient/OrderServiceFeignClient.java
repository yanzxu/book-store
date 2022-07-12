package com.xyz.bffservice.client.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "order-service", url = "${order-service.url}")
public interface OrderServiceFeignClient {

    @GetMapping("/orders")
    String test();
}
