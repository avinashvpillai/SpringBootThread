package com.avp.springboot.SpringBootThread.thread;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ImplClass1 {
	
	public void hello(String data) {
		System.out.println("hello  from ImplClass1 "+Thread.currentThread().getName());
		try {
			for(int i=0;i<20;i++) {
				System.out.println("from "+data+" -"+i);
			}
			//Thread.currentThread().wait(5000);
			System.out.println("exiting thread "+Thread.currentThread().getName()+" from ImplClass1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
