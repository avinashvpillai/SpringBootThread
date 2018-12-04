package com.avp.springboot.SpringBootThread.thread;

import org.springframework.stereotype.Service;

@Service
public class ImplClass2 {
	
	public void hello(String data) {
		System.out.println("hello  from ImplClass2 "+Thread.currentThread().getName());
		try {
			for(int i=20;i<30;i++) {
				System.out.println("from "+data+" -"+i);
			}
			System.out.println("exiting thread "+Thread.currentThread().getName()+" from ImplClass2");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
