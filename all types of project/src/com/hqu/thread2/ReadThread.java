package com.hqu.thread2;

public class ReadThread extends Thread {
	private Person person;
	
	public ReadThread(Person p) {
		this.person = p;
	}
	 
	@Override
	public void run() {
		while(true){
			person.show();
		}
		}
	}

