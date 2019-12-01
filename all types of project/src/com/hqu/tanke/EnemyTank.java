package com.hqu.tanke;

import java.util.Vector;

public class EnemyTank extends Tank implements Runnable{
	public EnemyTank(int x, int y) {
		super(x, y);
		this.setColor(2);
		this.setDirect(2);
	}
	Vector<Shot> ensh=new Vector<>();
	Vector<EnemyTank> ets=new Vector<>();
	
	//获取Mpanel上的敌人的坦克
	public void setets(Vector<EnemyTank>vv) {
		this.ets=vv;
	}
	
	//判断敌人坦克是否碰撞
	public boolean isTouch()
	{
	boolean b=false;
	EnemyTank et=null;
	switch(direct)
	{
	case 0:
	for(int i=0;i<ets.size();i++)
	{
	et=ets.get(i);
	if(et!=this)
	{
	if(et.direct==0||et.direct==2)
	{
		if(this.x>=et.x&&this.x<=et.x+20&&this.y<=et.y+30&&this.y>et.y)
		{
		return true;
		}
		if(this.x+20>=et.x&&this.x+20<=et.x+20&&this.y<=et.y+30&&this.y>et.y)
		{
		return true;
		}
		}
		if(et.direct==1||et.direct==3)
		{
		if(this.x>=et.x&&this.x<=et.x+30&&this.y
				<=et.y+20&&this.y>et.y)
		{
		return true;
		}
		if(this.x+20>=et.x&&this.x+20<=et.x+30&&this.y<=et.y+20&&this.y>et.y)
		{
		return true;
		}
		}
		}
		}
		break;
		case 1:
		for(int i=0;i<ets.size();i++)
		{
			et=ets.get(i);
			if(et!=this)
			{
			if(et.direct==0||et.direct==2)
			{
			if(this.x+30>=et.x&&this.x+30<=et.x+20&&this.y<=et.y+30&&this.y>et.y)
			{
			return true;
			}
			if(this.x+30>=et.x&&this.x+30<=et.x+20&&this.y+20<=et.y+30&&this.y+20>et.y)
			{
				return true;
				}
				}
				if(et.direct==1||et.direct==3)
				{
				if(this.x+30>=et.x&&this.x+30<=et.x+30&&this.y<=et.y+20&&this.y>et.y)
				{
				return true;
				}
				if(this.x+30>=et.x&&this.x+30<=et.x+30&&this.y+20<=et.y+20&&this.y+20>et.y)
				{
					return true;
					}
					}
					}
					}
					break;
					case 2:
					for(int i=0;i<ets.size();i++)
					{
					et=ets.get(i);
					if(et!=this)
					{
						if(et.direct==0||et.direct==2)
						{
						if(this.x>=et.x&&this.x<=et.x+20&&this.y+30<=et.y+30&&this.y+30>et.y)
						{
						return true;
						}
						if(this.x+20>=et.x&&this.x+20<=et.x+20&&this.y+30<=et.y+30&&this.y+30>et.y)
						{
						return true;
						}
						}
						if(et.direct==1||et.direct==3)
						{
						if(this.x>=et.x&&this.x<=et.x+30&&this.y+30<=et.y+20&&this.y+30>et.y)
						{
						return true;
						}
						if(this.x+20>=et.x&&this.x+20<=et.x+30&&this.y+30<=et.y+20&&this.y+30>et.y)
						{
						return true;
						}
						}
						}
					}
					break;
					case 3:
					for(int i=0;i<ets.size();i++)
					{
					et=ets.get(i);
					if(et!=this)
					{
					if(et.direct==0||et.direct==2)
					{
					if(this.x+30>=et.x&&this.x+30<=et.x+20&&this.y<=et.y+30&&this.y>et.y)
					{
					return true;
					}
					if(this.x+30>=et.x&&this.x+30<=et.x+20&&this.y+20<=et.y+30&&this.y+20>et.y)
					{
					return true;
					}
					}
					if(et.direct==1||et.direct==3)
					{
					if(this.x+30>=et.x&&this.x+30<=et.x+30&&this.y<=et.y+20&&this.y>et.y)
					{
					return true;
					}
					if(this.x+30>=et.x&&this.x+30<=et.x+30&&this.y+20<=et.y+20&&this.y+20>et.y)
					{
					return true;
					}
					}
					}
					}
					break;
					}
					return b;
	}
	public void run() {
		while(true)
		{
		switch(this.direct)
		{
		case 0:
		for(int i=0;i<30;i++)
		{
		if(y>0&&this.isTouch()==false)y-=this.speed;
		try {
		Thread.sleep(50);
		} catch (InterruptedException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			}
			break;
			case 1:
			for(int i=0;i<30;i++)
			{                
			if(x<365&&this.isTouch()==false)x+=this.speed;
			try {
			Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
				}
				break;
				case 2:
				for(int i=0;i<30;i++)
				{                    
				if(y<270&&this.isTouch()==false)y+=this.speed;
				try {
				Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
					}
					break;
					case 3:    
					for(int i=0;i<30;i++)
					{                
					if(x>0&&this.isTouch()==false)x-=this.speed;
					try {
					Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						}
						}
						break;
						}
						this.direct=(int)(Math.random()*4);
						if(this.isLive==false)
						{
						break;
						}
						if(ensh.size()<5)
						{
						Shot es=null;
						switch(this.direct)
						{
						case 0:
						es=new Shot(this.getX()+10,this.getY(),0);
						ensh.add(es);
						break;
						case 1:
						es=new Shot(this.getX()+30,this.getY()+10,1);
						ensh.add(es);
						break;
						case 2:
						es=new Shot(this.getX()+10,this.getY()+30,2);
						ensh.add(es);
						break;
						case 3:
						es=new Shot(this.getX(),this.getY()+10,3);
						ensh.add(es);
						break;
						}
						Thread th=new Thread(es);
						th.start();
						}
						}
						}
						}

