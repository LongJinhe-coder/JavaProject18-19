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
				person.update("����", "��");
			}else{
				person.update("����", "���в�Ů");
			}
			i=(i+1)%2;
		}
	}
	
	
	
}
