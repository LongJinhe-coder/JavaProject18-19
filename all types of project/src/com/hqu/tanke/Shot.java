package com.hqu.tanke;

public class Shot implements Runnable {
	int shotX;
	int shotY;
	int direct;
	int shotspeed=1;
	boolean isLive=true;
	public Shot(int shotX, int shotY, int direct) {
	
		this.shotX = shotX;
		this.shotY = shotY;
		this.direct = direct;
	}
	public int getShotX() {
		return shotX;
	}
	public void setShotX(int shotX) {
		this.shotX = shotX;
	}
	public int getShotY() {
		return shotY;
	}
	public void setShotY(int shotY) {
		this.shotY = shotY;
	}
	public int getShotspeed() {
		return shotspeed;
	}
	public void setShotspeed(int shotspeed) {
		this.shotspeed = shotspeed;
	}
	public void  run() {
		while(true){
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			switch (direct) {
			case 0:
				shotY-=shotspeed;
				break;
				
			case 1:
				shotX+=shotspeed;
				break;
				
			case 2:
				shotY+=shotspeed;
				break;
				
			case 3:
				shotX-=shotspeed;
				break;
			}
				if(shotX<0||shotX>400||shotY<0||shotY>300){
					isLive=false;
					break;
				}
			}
			}
		}
	
	


