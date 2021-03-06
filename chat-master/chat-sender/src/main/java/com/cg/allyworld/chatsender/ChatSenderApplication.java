package com.cg.allyworld.chatsender;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.allyworld.chatsender.entity.ChatWebsite;

@SpringBootApplication
public class ChatSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatSenderApplication.class, args);
	}
	
	@Bean
	public Queue queue() {
		return new Queue("chatQ",false);
	}

	@Bean
	public ChatWebsite chat()
	{
		return new ChatWebsite();
	}
}

