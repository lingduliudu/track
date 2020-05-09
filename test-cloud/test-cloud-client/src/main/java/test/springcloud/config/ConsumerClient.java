package test.springcloud.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value= "nacos-provide",path = "/nacos-provide")
public interface ConsumerClient {

    @GetMapping("/service")
    String service();
}