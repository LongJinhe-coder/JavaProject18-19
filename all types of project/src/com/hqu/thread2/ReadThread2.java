package com.hqu.thread2;
public class ReadThread2 extends Thread {
	private Person person;
	
	public ReadThread2(Person p) {
		this.person = p;
	}
	 
	@Override
	public void run() {
		synchronized (person) {
			while(true){
				person.show();
			}
		}
		
		}
	}
