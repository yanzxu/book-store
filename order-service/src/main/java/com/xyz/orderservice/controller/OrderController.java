package com.xyz.orderservice.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    public String test() {
        log.info("======= orderController =======");
        return "this is orderController.";
    }
}
