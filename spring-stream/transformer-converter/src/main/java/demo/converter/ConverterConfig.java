package demo.converter;

import org.springframework.cloud.stream.converter.AbstractFromMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConverterConfig {
	
	@Bean
	public AbstractFromMessageConverter fooConverter() {
		return new FooToBarConverter();
	}


}
