package com.hqu.thread2;

public class UpdateThread extends Thread{
	private Person person;

	public UpdateThread(Person person) {
		this.person = person;
	}
	
	@Override
	public void run() {
		int i=0;
		while(true){
			if(i==0){
				person.update("张三", "男");
			}else{
				person.update("李四", "不男不女");
			}
			i=(i+1)%2;
		}
	}
	
	
	
}
