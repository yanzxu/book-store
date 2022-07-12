package com.xyz.bffservice.client.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user-service", url = "${user-service.url}")
public interface UserServiceFeignClient {

    @GetMapping("/users")
    String test();
}
