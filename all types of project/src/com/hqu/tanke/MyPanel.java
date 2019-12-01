package com.hqu.tanke;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.JPanel;

//我的面板
class MyPanel extends JPanel implements KeyListener,Runnable
{
//定义一个我的坦克
Hero hero=null;
EnemyTank et=null;
Image image1=null;
Image image2=null;
Image image3=null;
Image im=null;
Vector<Bomb> bombs =new Vector<Bomb>();
Vector<EnemyTank> etm =new Vector<EnemyTank>();
int ensize=5;
public void paint(Graphics g)
{
super.paint(g);
g.fillRect(0, 0, 400, 300);
g.drawImage(im, 0, 0, 400, 300,this);
//画出自己的坦克
if(hero.isLive==true)
{
this.drawTank(this.hero.getX(), this.hero.getY(),
		g, this.hero.getDirect(),this.hero.getColor() );
		}
		//画出子弹
		for(int i=0;i<hero.shotm.size();i++)
		{
		Shot myshot=hero.shotm.get(i);
		if(myshot!=null&&myshot.isLive==true)
		{
		g.fill3DRect(myshot.getShotX(),
		myshot.getShotY(), 2, 2, false);
		}
		if(myshot.isLive==false)hero.shotm.remove(myshot);
		}
		//画出炸弹
		for(int i=0;i<bombs.size();i++)
		{
		Bomb b=bombs.get(i);
		if(b.lift>6)
		{
		g.drawImage(image1, b.x, b.y, 30, 30, this);
		}else if(b.lift>3)
		{
		g.drawImage(image2, b.x, b.y, 30, 30, this);
		}else
		{
			g.drawImage(image3, b.x, b.y, 30, 30, this);
		}
		b.liftdown();
		if(b.lift==0)bombs.remove(b);
		}
		//画出敌人的坦克
		for(int i=0;i<etm.size();i++)
		{
		et=etm.get(i);
		if(et!=null&&et.isLive==true)
		{                
		this.drawTank(et.getX(), et.getY(),
		g, et.getDirect(), et.getColor());
		}
		//画出敌人的子弹
		for(int j=0;j<et.ensh.size();j++)
		{
		Shot enshot=et.ensh.get(j);
		if(enshot.isLive==true)
		{
		g.fill3DRect(enshot.getShotX(),
		enshot.getShotY(), 2, 2, false);
//		                    System.out.println("第"+i+"辆坦克的第"+j+"颗子弹的Y="+enshot.getShotY());
		}else
		{
			et.ensh.remove(enshot);
		}
		}
		}
		}
		//判断子弹是否击中坦克的函数
		public void hitTank(Shot s,Tank t)
		{
		switch(t.getDirect())
		{
		case 0:
		case 2:
		if(s.getShotX()>t.getX()&&s.getShotX()<t.getX()+20&&
				s.getShotY()>t.getY()&&s.getShotY()<t.getY()+30)
		{
		s.isLive=false;
		t.isLive=false;
		Bomb b=new Bomb(t.getX(),t.getY());
		bombs.add(b);
		}
		break;
		case 1:
		case 3:
		if(s.getShotX()>t.getX()&&s.getShotX()<t.getX()+30&&
		s.getShotY()>t.getY()&&s.getShotY()<t.getY()+20)
		{
			s.isLive=false;
			t.isLive=false;
			Bomb b=new Bomb(t.getX(),t.getY());
			bombs.add(b);
			}
			}
			}
			//画出坦克的函数
			public void drawTank(int xx,int yy,Graphics g,int direct,int type)
			{
				//判断什么颜色类型的坦克
				switch(type)
				{
				case 0:
				g.setColor(Color.CYAN);
				break;
				case 1:
				g.setColor(Color.pink);
				break;
				case 2:
				g.setColor(Color.red);
				break;
				case 3:
				g.setColor(Color.green);
				break;
				case 4:
					g.setColor(Color.blue);
					break;
					case 5:
					g.setColor(Color.yellow);
					break;
					}
					//判断什么方向的坦克
					switch(direct)
					{
					//向上
					case 0:
					g.fill3DRect(xx, yy, 5, 30, false);
					g.fill3DRect(xx+15, yy, 5, 30, false);
					g.fill3DRect(xx+5, yy+5, 10, 20, false);
					g.fillOval(xx+5, yy+10, 10, 10);
					g.drawLine(xx+10, yy+15, xx+10, yy);
					break;
					//向右
					case 1:
					g.fill3DRect(xx, yy, 30, 5, false);
					g.fill3DRect(xx, yy+15, 30, 5, false);
					g.fill3DRect(xx+5, yy+5, 20, 10, false);
					g.fillOval(xx+10, yy+5, 10, 10);
					g.drawLine(xx+15, yy+10, xx+30, yy+10);
					break;
					//向下
					case 2:
						g.fill3DRect(xx, yy, 5, 30, false);
						g.fill3DRect(xx+15, yy, 5, 30, false);
						g.fill3DRect(xx+5, yy+5, 10, 20, false);
						g.fillOval(xx+5, yy+10, 10, 10);
						g.drawLine(xx+10, yy+15, xx+10, yy+30);
						break;
						//向左
						case 3:
						g.fill3DRect(xx, yy, 30, 5, false);
						g.fill3DRect(xx, yy+15, 30, 5, false);
						g.fill3DRect(xx+5, yy+5, 20, 10, false);
						g.fillOval(xx+10, yy+5, 10, 10);
						g.drawLine(xx+15, yy+10, xx, yy+10);
						break;
						}
						}
						public MyPanel()
						{
						hero=new Hero(100,100);
						im=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/p1tankL"));
						//创建敌人坦克
						for(int i=0;i<ensize;i++) 
						{
						et=new EnemyTank((i+1)*50,0);
						Shot enshot=new Shot(et.getX()+10,et.getY()+30,et.getDirect());
						Thread eth=new Thread(enshot);
						eth.start();
						et.ensh.add(enshot);
						Thread th=new Thread(et);
						th.start();
						etm.add(et);
						et.setets(etm);
						}
//						        try {
//						            image1=ImageIO.read(new File("bomb_1.gif"));
//			            image2=ImageIO.read(new File("bomb_2.gif"));
//			            image3=ImageIO.read(new File("bomb_3.gif"));
//			        } catch (IOException e) {
//			            // TODO Auto-generated catch block
//			            e.printStackTrace();
//			        }
			image1=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
			image2=Toolkit.getDefaultToolkit().
					getImage(Panel.class.getResource("/blast5.gif"));
			image3=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));
			}
			//控制坦克移动
			public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			if(arg0.getKeyCode()==KeyEvent.VK_DOWN)
			{
			this.hero.setDirect(2);
			this.hero.movedown();
			}else if(arg0.getKeyCode()==KeyEvent.VK_UP)
			{
			this.hero.setDirect(0);
			this.hero.moveup();
			}else if(arg0.getKeyCode()==KeyEvent.VK_LEFT)
			{
			this.hero.setDirect(3);
			this.hero.moveleft();
			}else if(arg0.getKeyCode()==KeyEvent.VK_RIGHT)
			{
			this.hero.setDirect(1);
			this.hero.moveright();
			}else if(arg0.getKeyCode()==KeyEvent.VK_P)
			{
			hero.speed=0;
			et.speed=0;
			}
			//发射子弹(连发5枚子弹)
			if(hero.shotm.size()<=4)
			{
			if(arg0.getKeyCode()==KeyEvent.VK_SPACE)
			{
			hero.shotenemy(hero.getX(),hero.getY(),hero.getDirect());
			}
			}
			//控制坦克不能跑出边界
			if(this.hero.getX()<0)this.hero.setX(0);
			if(this.hero.getY()<0)this.hero.setY(0);
			if(this.hero.getX()>365)this.hero.setX(365);
			if(this.hero.getY()>270)this.hero.setY(270);
			//面板重绘
			this.repaint();
			}
			public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			}
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				}
				public void run() {
				while(true)
				{
				try {
				Thread.sleep(50);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
				//不停地调用敌人是否打中自己坦克函数
				for(int i=0;i<etm.size();i++)
				{
				et=etm.get(i);
				for(int j=0;j<et.ensh.size();j++)
				{
				Shot enshot=et.ensh.get(j);
				if(enshot.isLive==true&&hero.isLive==true)
				{
				this.hitTank(enshot, hero);
				}
				}
				}
				//不停地调用是否打中敌人坦克函数
				for(int i=0;i<hero.shotm.size();i++)
				{
				Shot s=hero.shotm.get(i);
				if(s!=null&&s.isLive==true)
				{
				for(int j=0;j<etm.size();j++)
				{
				EnemyTank et=etm.get(j);
				if(et!=null&&et.isLive==true)
				{
				this.hitTank(s, et);
				}
				}
				}
				}
				//面板重绘
				this.repaint();
				}
				}
				}

