package tot.tools.config;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;


@Component
public class CompnentTest {

	@PostConstruct
	public void init() {
		System.out.println("init tools success... ");
	}
}
