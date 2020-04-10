package tot.tools.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import tot.tools.service.ConditionalClass;

@Configuration
@ComponentScan(basePackages = "tot")
@ConditionalOnClass(ConditionalClass.class)
public class AutoConfig {
	
}
