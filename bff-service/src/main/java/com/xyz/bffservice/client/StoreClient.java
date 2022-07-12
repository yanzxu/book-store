package com.xyz.bffservice.client;

import com.xyz.bffservice.client.feignclient.StoreServiceFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StoreClient {
    public final StoreServiceFeignClient storeServiceFeignClient;

    public String test() {
        return storeServiceFeignClient.test();
    }

}
