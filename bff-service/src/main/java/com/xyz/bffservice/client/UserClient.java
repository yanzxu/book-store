package com.xyz.bffservice.client;

import com.xyz.bffservice.client.feignclient.UserServiceFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserClient {
    public final UserServiceFeignClient userServiceFeignClient;

    public String test() {
        return userServiceFeignClient.test();
    }

}
