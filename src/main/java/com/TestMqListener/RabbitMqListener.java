package com.TestMqListener;

import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqListener implements MessageListener {
	
	private  static final org.slf4j.Logger LOGGER= LoggerFactory.getLogger(RabbitMqListener.class);
	
	@Override
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		
		LOGGER.info("The mesage is {}" + new String(message.getBody()));
		
	}

}
