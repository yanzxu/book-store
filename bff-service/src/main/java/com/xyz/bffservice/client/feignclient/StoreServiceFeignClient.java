package com.xyz.bffservice.client.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "store-service", url = "${store-service.url}")
public interface StoreServiceFeignClient {

    @GetMapping("/orders")
    String test();
}
