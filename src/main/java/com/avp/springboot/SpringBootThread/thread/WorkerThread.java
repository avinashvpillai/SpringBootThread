package com.avp.springboot.SpringBootThread.thread;

public class WorkerThread implements Runnable{
	
	InputPojo data;
	
	WorkerThread(InputPojo data,ImplClass1 impl1,ImplClass2 impl2){
		this.data = data;
		this.impl1 = impl1;
		this.impl2 = impl2;
	}
	
	ImplClass1 impl1;
	
	ImplClass2 impl2;

	@Override
	public void run() {
		if(data.getOperationName().equalsIgnoreCase("test1")) {
			new ImplClass1().hello("test1");
		}
		if(data.getOperationName().equalsIgnoreCase("test2")) {
			impl2.hello(data.getOperationName());
		}
	}

}
