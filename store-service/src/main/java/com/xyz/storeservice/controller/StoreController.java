package com.xyz.storeservice.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/stores")
public class StoreController {

    @GetMapping
    public String test() {
        log.info("======= storeController =======");
        return "this is storeController.";
    }
}
