package com.avp.springboot.SpringBootThread.thread;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FixedThreadPoolExecutor {	
		
	static volatile CopyOnWriteArrayList<InputPojo> inputList = new CopyOnWriteArrayList<InputPojo>();
	
	ExecutorService executor = Executors.newFixedThreadPool(10);
	
	@Autowired
	ImplClass1 impl1;
	
	@Autowired
	ImplClass2 impl2;
	
	public void setInputListData(InputPojo inputPojo) {
		this.inputList.add(inputPojo);
	}


	@SuppressWarnings("static-access")
	public void run() {
		while(true) {
			System.out.println("running FixedThreadPoolExecutor");
			System.out.println("size of inputList: "+inputList.size()+ " impl1:"+impl1+", impl2:"+impl2);
			if(inputList.size() > 0) {
				System.out.println("processing data...");
				CopyOnWriteArrayList<InputPojo> inputListCopy = (CopyOnWriteArrayList<InputPojo>) inputList.clone();
				inputList = new CopyOnWriteArrayList<InputPojo>();
				for(InputPojo data:inputListCopy) {
					WorkerThread worker = new WorkerThread(data,impl1,impl2);
					executor.execute(worker);
				}				
			}
			try {
				Thread.currentThread().sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void init() {
	     FixedThreadPoolExecutor t = new FixedThreadPoolExecutor() ;
	     t.run();
	}
}
