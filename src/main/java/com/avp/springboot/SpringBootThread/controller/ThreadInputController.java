package com.avp.springboot.SpringBootThread.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avp.springboot.SpringBootThread.thread.FixedThreadPoolExecutor;
import com.avp.springboot.SpringBootThread.thread.InputPojo;

@RestController
@RequestMapping("/thread")
public class ThreadInputController {
	
	@Autowired
	FixedThreadPoolExecutor executer;
	
	@PostMapping(value = "/thread1")
	public void createThread1() {
		System.out.println("new requiest received to createThread1");
		InputPojo data = new InputPojo();
		data.setOperationName("test1");
		executer.setInputListData(data);
		
	}
	
	@PostMapping(value = "/thread2")
	public void createThread2() {
		System.out.println("new requiest received to createThread2");
		InputPojo data = new InputPojo();
		data.setOperationName("test2");
		executer.setInputListData(data);
	}

}
