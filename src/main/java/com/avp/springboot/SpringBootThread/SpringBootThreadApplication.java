package com.avp.springboot.SpringBootThread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.avp.springboot.SpringBootThread.thread.FixedThreadPoolExecutor;

@ComponentScan("com.avp.springboot.SpringBootThread")
@SpringBootApplication
public class SpringBootThreadApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThreadApplication.class, args);
		new FixedThreadPoolExecutor().init();
	}
}
