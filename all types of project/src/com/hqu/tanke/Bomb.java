package com.hqu.tanke;

public class Bomb 
	{
		int x;
		int y;
		int lift=9;
		boolean isLive=true;
		public Bomb(int x,int y)
		{
		this.x=x;
		this.y=y;
		}
		//ը��������ֵ
		public void liftdown()
		{
		if(lift>0){
			lift--;
		}else
		{
		isLive=false;
		}
		}
	}

		


