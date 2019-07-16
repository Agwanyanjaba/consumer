package com.wycliffe.consumer;

import com.wycliffe.consumer.service.AccountConsumerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);

		AccountConsumerService accountConsumerService = new AccountConsumerService();
		accountConsumerService.getAccountList();
	}

}
