package tot.tools.service;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class ConditionalClass {

	@PostConstruct
	public void init() {
		System.out.println("tools init success...");
	}
}
