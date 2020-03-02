package com.TestMqListener;

import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitListenTestApplication implements CommandLineRunner{
	
	private  static final org.slf4j.Logger LOGGER= LoggerFactory.getLogger(RabbitListenTestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RabbitListenTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOGGER.debug("Starting thge queue listening application");
		
		
		
	}

}
