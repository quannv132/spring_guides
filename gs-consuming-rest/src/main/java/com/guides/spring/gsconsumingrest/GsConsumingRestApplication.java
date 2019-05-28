package com.guides.spring.gsconsumingrest;

import com.guides.spring.gsconsumingrest.hello.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GsConsumingRestApplication {

	private static final Logger log = LoggerFactory.getLogger(GsConsumingRestApplication.class);
//	public static void main(String[] args) {
//		RestTemplate restTemplate = new RestTemplate();
//		Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
//		log.info(quote.toString());
//	}

	public static void main(String args[]) {
		SpringApplication.run(GsConsumingRestApplication.class);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Quote quote = restTemplate.getForObject(
					"https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
			log.info(quote.toString());
		};
	}
}
