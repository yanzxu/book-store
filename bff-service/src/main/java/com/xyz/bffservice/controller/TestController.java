package com.xyz.bffservice.controller;

import com.xyz.bffservice.client.UserServiceFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bff")
@RequiredArgsConstructor
public class TestController {

    private final UserServiceFeignClient userServiceFeignClient;

    @GetMapping
    public String test() {
        return userServiceFeignClient.test();
    }

}
