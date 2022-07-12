package com.xyz.bffservice.client;

import com.xyz.bffservice.client.feignclient.OrderServiceFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderClient {
    public final OrderServiceFeignClient orderServiceFeignClient;

    public String test() {
        return orderServiceFeignClient.test();
    }

}
