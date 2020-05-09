package test.springcloud.config;

import org.springframework.stereotype.Service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

@Service
public class SenService {

	@SentinelResource("test")
    public String hello(){
        return "Hello World Sentinel";
    }
}
