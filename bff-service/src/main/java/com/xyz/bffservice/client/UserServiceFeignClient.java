package com.xyz.bffservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user-service", url = "http://localhost:8091")
public interface UserServiceFeignClient {

    @GetMapping("/users")
    String test();
}
