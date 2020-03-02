package com.TestMqListener;

import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.listener.MessageListenerContainer;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMqController {

	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(RabbitMqController.class);
	
	
	
	@Autowired
	MessageListenerContainer messageListenerContainer;

	@GetMapping( value= "/startQ")
	public boolean StartTheQueue(){
		LOGGER.debug("Starting the Queue");
		
		messageListenerContainer.start();
		LOGGER.debug("is queue running {}", messageListenerContainer.isRunning());
		return true;	
		
	}
	
	@GetMapping( value= "/stopQ")
	public boolean StopTheQueue(){
		LOGGER.debug("Stoping the Queue");
		
		messageListenerContainer.stop();
		LOGGER.debug("is queue running {}", messageListenerContainer.isRunning());
		return true;	
		
	}

}
