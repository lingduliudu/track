package test.springcloud.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

@RestController
public class RController {

	@Autowired
	private ConsumerClient consumerClient;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	private SenService senService;
	
	
	@GetMapping("service")
	public String service() {
		System.out.println(senService.hello());
		return consumerClient.service();
	}
	
	@GetMapping("service2")
	@SentinelResource("service2")
	public String service2() {
		return restTemplate.getForObject("http://nacos-provide/nacos-provide/service",String.class);
	}
}
