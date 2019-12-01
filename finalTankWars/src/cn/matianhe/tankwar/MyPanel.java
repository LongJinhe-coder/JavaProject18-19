package cn.matianhe.tankwar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Map;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JPanel;




public class MyPanel extends JPanel implements KeyListener, Runnable {
	int enSize = 10;//敌人坦克数量
    Hero hero = null;
    int count=0;//累加器，记录敌方坦克死亡数
    int k=0;    //通过k的值来判断选择哪一个重画方法，k=0画出起始界面(选择模式)；按下enter键，k=1，画出游戏主界面
    
    Vector<EnemyTank> enemyTanks = new Vector<EnemyTank>();

   //Bomb bomb=new Bomb(x, y)
    Vector<Bomb> bombs = new Vector<Bomb>();

    Image grass = null;
    Image steel = null;
    Image water = null;
    Image wall = null;
    Image star = null;
    Image boom = null;
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;
    Image image4 = null;
    Image image5 = null;
    Image image6 = null;
    Image image7 = null;
    Image image8 = null;
    Image image9= null;
    Image image10 = null;
    Image image11= null;
    Image image12 = null;

    public MyPanel() {
        hero = new Hero(500, 400);//己方坦克起始位置

       //生成敌方坦克
        for (int i = 0; i < enSize; i++) {
           EnemyTank et = new EnemyTank((i ) * 90, (int) (Math.random()*160));
            
            et.setEts(enemyTanks);
            enemyTanks.add(et);//将生成的敌方坦克放入数组
            
            Thread t = new Thread(et);
            try {
				Thread.sleep(500);//避免让所有坦克同时启动线程
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            t.start();//敌人坦克线程启动
        }
            
      //导入图片
        boom = Toolkit.getDefaultToolkit().getImage(
                MyPanel.class.getResource("/images/hp.png"));
         grass = Toolkit.getDefaultToolkit().getImage(
                MyPanel.class.getResource("/images/grass.png"));
         steel = Toolkit.getDefaultToolkit().getImage(
                MyPanel.class.getResource("/images/steels.gif"));
         water = Toolkit.getDefaultToolkit().getImage(
                MyPanel.class.getResource("/images/river.jpg"));
         wall = Toolkit.getDefaultToolkit().getImage(
                MyPanel.class.getResource("/images/walls.gif"));
         star = Toolkit.getDefaultToolkit().getImage(
                 MyPanel.class.getResource("/images/star.gif"));
        image1 = Toolkit.getDefaultToolkit().getImage(
                MyPanel.class.getResource("/images/1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(
                MyPanel.class.getResource("/images/2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(
                MyPanel.class.getResource("/images/3.gif"));
        image4 = Toolkit.getDefaultToolkit().getImage(
                MyPanel.class.getResource("/images/4.gif"));
        image5 = Toolkit.getDefaultToolkit().getImage(
                MyPanel.class.getResource("/images/5.gif"));
        image6 = Toolkit.getDefaultToolkit().getImage(
                MyPanel.class.getResource("/images/6.gif"));
        image7 = Toolkit.getDefaultToolkit().getImage(
                MyPanel.class.getResource("/images/7.gif"));
        image8 = Toolkit.getDefaultToolkit().getImage(
                MyPanel.class.getResource("/images/8.gif"));
        image9 = Toolkit.getDefaultToolkit().getImage(
                MyPanel.class.getResource("/images/select1.png"));
        image10 = Toolkit.getDefaultToolkit().getImage(
                MyPanel.class.getResource("/images/select2.png"));
        image11 = Toolkit.getDefaultToolkit().getImage(
                MyPanel.class.getResource("/images/defeat.jpg"));
        image12 = Toolkit.getDefaultToolkit().getImage(
                MyPanel.class.getResource("/images/vectory.jpg"));
        
    }

    
    //重画方法
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        //画出起始界面(选择模式)
        if(k==0) {
        	g.drawImage(image9, 0, 0, 1030, 740,null);
        }
        
        //画出游戏界面
        else if(k==1){
        if(hero.isLive&&WallSetting.MAP[18][23]==4){//[18][23]为司令位置，如果己方坦克和司令还存在，就继续重画
         
       
        g.fillRect(0, 0, Game.width, Game.height);
        
        
        //画出主坦克
        if(hero.isLive){//重绘过程当中时刻判断己方坦克是否存活，若为False则不再画出己方坦克
       
        	drawMyTank(hero.getX(),hero.getY(),g,hero.Direct);
        //每次重画都判断己方坦克当前位置与方向
        
        for (int i = 0; i < hero.shotBox.size(); i++) {
            Shot myShot = hero.shotBox.get(i);
           //遍历己方坦克的子弹数组
            
            if (myShot != null && myShot.isLive == true) {
                
                g.setColor(Color.red);
                if(hero.Direct==0||hero.Direct==1){
                g.fillRect(myShot.x+7, myShot.y, 5, 5);//画出己方子弹
            }else if(hero.Direct==2||hero.Direct==3){
            	g.fillRect(myShot.x, myShot.y+7, 5, 5);//画出己方子弹
            }
            
            }
            if (myShot.isLive == false) {
                hero.shotBox.remove(myShot);//如果子弹失活，则移除子弹
            }
        }
        }
      

        for (int i = 0; i < bombs.size(); i++) {
            
            Bomb b = bombs.get(i);
           //炸弹生命值为9，使得爆炸动画更长
            if (b.life > 8) {
            	System.out.println("boom1");
                g.drawImage(image1, b.x, b.y, 30, 30, this);
            } else if (b.life > 7) {
            	System.out.println("boom");
                g.drawImage(image2, b.x, b.y, 30, 30, this);
            } else if (b.life > 6) {
                g.drawImage(image3, b.x, b.y, 30, 30, this);
            } else if (b.life > 5) {
                g.drawImage(image4, b.x, b.y, 30, 30, this);
            } else if (b.life > 4) {
                g.drawImage(image5, b.x, b.y, 30, 30, this);
            } else if (b.life > 3) {
                g.drawImage(image6, b.x, b.y, 30, 30, this);
            } else if (b.life > 2) {
                g.drawImage(image7, b.x, b.y, 30, 30, this);
            } else if (b.life > 1) {
                g.drawImage(image8, b.x, b.y, 30, 30, this);
            }

            b.lifeDown();//生命值减一
           
            if (b.life == 0) {
                bombs.remove(b);//如果生命值为0，移除炸弹
            }
        }

       //画出敌方坦克和敌方子弹
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank et = enemyTanks.get(i);
            if (et.isLive) {//若坦克还存活就继续画
            	drawEnemyTank(et.getX(),et.getY(),g,et.getDirect());
                //根据敌方坦克当前位置与方向画坦克
              
                for (int j = 0; j < et.ss.size(); j++) {
                    Shot enemyShot = et.ss.get(j);// 遍历敌人子弹数组
                    if (enemyShot.isLive) {
                    	g.setColor(Color.CYAN);
                        if(et.Direct==0||et.Direct==1){
                            g.fillRect(enemyShot.x+7, enemyShot.y, 5, 5);//画出敌方子弹
                        }else if(et.Direct==2||et.Direct==3){
                        	g.fillRect(enemyShot.x,enemyShot.y+7, 5, 5);//画出敌方子弹
                        }
                    } else {
                       
                        et.ss.remove(enemyShot);//如果敌方子弹失活，则移除
                    }
                }
            }

        }
        //画背景图                   
        //画爱心地雷
        for (int x = 0; x < WallSetting.MAP.length; x++) {
			for (int y = 0; y < WallSetting.MAP[x].length; y++) {
				if (WallSetting.MAP[x][y] == WallSetting.BOOM) {
					g.drawImage(boom, x * WallSetting.CELL, y * WallSetting.CELL, (x + 1) * WallSetting.CELL,
							(y + 1) * WallSetting.CELL, 0, 0, 28, 28, this);
				}
			}
		}
        //画草丛
        for (int x = 0; x < WallSetting.MAP.length; x++) {
			for (int y = 0; y < WallSetting.MAP[x].length; y++) {
				if (WallSetting.MAP[x][y] == WallSetting.GRASS) {
					g.drawImage(grass, x * WallSetting.CELL, y * WallSetting.CELL, (x + 1) * WallSetting.CELL,
							(y + 1) * WallSetting.CELL, 0, 0, 28, 28, this);
				}
			}
		}
        //画铁块
        for (int x = 0; x < WallSetting.MAP.length; x++) {
			for (int y = 0; y < WallSetting.MAP[x].length; y++) {
				if (WallSetting.MAP[x][y] == WallSetting.BORDER) {
					g.drawImage(steel, x * WallSetting.CELL, y * WallSetting.CELL, (x + 1) * WallSetting.CELL,
							(y + 1) * WallSetting.CELL, 0, 0, 28, 28, this);
				}
			}
		}
        //画水
		for (int x = 0; x < WallSetting.MAP.length; x++) {
			for (int y = 0; y < WallSetting.MAP[x].length; y++) {
				if (WallSetting.MAP[x][y] == WallSetting.WATER) {
					g.drawImage(water, x * WallSetting.CELL, y * WallSetting.CELL, (x + 1) * WallSetting.CELL,
							(y + 1) * WallSetting.CELL, 0, 0, 28, 28, this);
				}
			}
		}
		//画普通墙
		for (int x = 0; x < WallSetting.MAP.length; x++) {
			for (int y = 0; y < WallSetting.MAP[x].length; y++) {
				if (WallSetting.MAP[x][y] == WallSetting.BRICK) {
					g.drawImage(wall, x * WallSetting.CELL, y * WallSetting.CELL, (x + 1) * WallSetting.CELL,
							(y + 1) * WallSetting.CELL, 0, 0, 28, 28, this);
				}
			}
		}
		//画己方的司令
		for (int x = 0; x < WallSetting.MAP.length; x++) {
			for (int y = 0; y < WallSetting.MAP[x].length; y++) {

				if (WallSetting.MAP[x][y] == WallSetting.BOSS) {
					g.drawImage(star, x * WallSetting.CELL, y * WallSetting.CELL, (x + 1) * WallSetting.CELL,
							(y + 1) * WallSetting.CELL, 0, 0, 28, 28, this);
				}
				if (WallSetting.MAP[x][y] == 5) {
					g.drawImage(null, x * WallSetting.CELL, y * WallSetting.CELL, (x + 1) * WallSetting.CELL,
							(y + 1) * WallSetting.CELL, 0, 0, 28, 28, this);
				}

			}
		}
    }
        if(!hero.isLive||WallSetting.MAP[18][23]==5){//如果己方坦克或司令阵亡，弹出游戏结束图片
        	Image img = Toolkit.getDefaultToolkit().getImage(
    				MyPanel.class.getClassLoader().getResource("images/defeat.jpg"));
    		g.drawImage(img, 0, 0, 1030, 730, this);
        }
     }
        //如果敌方坦克死亡数等于敌方坦克生成数目时，画结束界面
        if(count==enSize)
        	g.drawImage(image12, 0, 0, 1030, 730, this);
        	
    }
   
	
    public void hitMe() {
      //判断敌方所有坦克的任意子弹是否击中我方坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
           
            EnemyTank et = enemyTanks.get(i);
           
            for (int j = 0; j < et.ss.size(); j++) {
                Shot enemyShot = et.ss.get(j);
                if(hero.isLive)
                isHit(enemyShot, hero);
            }
        }
    }

    public void hitEnemyTank() {
        //判断己方每一颗子弹是否击中敌方任意一辆坦克
        for (int i = 0; i < hero.shotBox.size(); i++) {
            Shot myShot = hero.shotBox.get(i);
           //遍历自己坦克子弹数组
            if (myShot.isLive) { 
                // 判断自己子弹是否存在
                for (int j = 0; j < enemyTanks.size(); j++) {
                    EnemyTank et = enemyTanks.get(j);
                    //遍历敌方坦克数组
                    if (et.isLive) {
                        isHit(myShot, et);
                    }
                }
            }
        }
    }

    //判断子弹是否击中坦克
    public void isHit(Shot s, Tank et) {
        
        switch (et.Direct) {
       
        case 0:
        case 1:
            if (s.x > et.x && s.x < et.x + 34 && s.y > et.y && s.y < et.y + 34) {
               //子弹坐标与坦克坐标重合
                s.isLive = false;
                // ̹子弹失活
                et.isLive = false;
                // 坦克失活
                Bomb b = new Bomb(et.x, et.y);
                bombs.add(b);
                Sound.bombMusic();
                count++;//出现爆炸
            }
            break;
       
        case 2:
        case 3:
            if (s.x > et.x && s.x < et.x + 34 && s.y > et.y && s.y <= et.y + 34) {
                s.isLive = false;
                et.isLive = false;
                Bomb b = new Bomb(et.x, et.y);
                bombs.add(b);
                Sound.bombMusic();
                count++;
            }
            break;

        default:
            break;

        }
    }
    //判断敌方子弹打墙
 public void etShotIsHitWall() {
	 for (int i = 0; i < enemyTanks.size(); i++) {
         
         EnemyTank et = enemyTanks.get(i);//遍历敌方所有坦克
        
         for (int j = 0; j < et.ss.size(); j++) {//遍历敌方坦克所有子弹
             Shot enemyShot = et.ss.get(j);
         if (enemyShot.isLive) { 
             // 判断敌方子弹是否存在
        	 
   		  for (int a = 0; a < WallSetting.MAP.length; a++) {
   				for (int b = 0; b < 25; b++) {
   				 //如果墙是砖块，则子弹打墙产生爆炸，子弹与墙消失
                 if(WallSetting.MAP[a][b] == WallSetting.BRICK 
                		 ||WallSetting.MAP[a][b] == WallSetting.BOSS){
             
                	switch (enemyShot.Direct) {
                	//判断子弹与墙是否相撞
					case 0: if(enemyShot.x>a*28-5&&enemyShot.x<a*28+28&&enemyShot.y<b*28+28
							&&enemyShot.y>b*28){
						enemyShot.isLive=false;
						WallSetting.MAP[a][b]=5;
						 Bomb c = new Bomb(a*28, b*28);
			                bombs.add(c);
					}
						break;
					case 1: if(enemyShot.x>a*28-5&&enemyShot.x<a*28+28&&enemyShot.y<b*28+28
							&&enemyShot.y>b*28){
						enemyShot.isLive=false;
						WallSetting.MAP[a][b]=5;
						 Bomb c = new Bomb(a*28, b*28);
			                bombs.add(c);
					}
						break;
					case 2: if(enemyShot.x>a*28&&enemyShot.x<a*28+28&&enemyShot.y<b*28+28
							&&enemyShot.y>b*28-5){
						enemyShot.isLive=false;
						WallSetting.MAP[a][b]=5;
						 Bomb c = new Bomb(a*28, b*28);
			                bombs.add(c);
					}
						break;
					case 3: if(enemyShot.x>a*28&&enemyShot.x<a*28+28&&enemyShot.y<b*28+28
							&&enemyShot.y>b*28-5){
						enemyShot.isLive=false;
						WallSetting.MAP[a][b]=5;
						 Bomb c = new Bomb(a*28, b*28);
			                bombs.add(c);
					}
						break;

					default:
						break;
					}
                //如果墙是铁块，则子弹消失，不产生爆炸	 
             }else if(WallSetting.MAP[a][b] == WallSetting.BORDER  ){
            	 switch (enemyShot.Direct) {
					case 0: if(enemyShot.x>a*28-5&&enemyShot.x<a*28+28&&enemyShot.y<b*28+28
							&&enemyShot.y>b*28){
						enemyShot.isLive=false;
					}
						break;
					case 1: if(enemyShot.x>a*28-5&&enemyShot.x<a*28+28&&enemyShot.y<b*28+28
							&&enemyShot.y>b*28){
						enemyShot.isLive=false;
						
					}
						break;
					case 2: if(enemyShot.x>a*28&&enemyShot.x<a*28+28&&enemyShot.y<b*28+28
							&&enemyShot.y>b*28-5){
						enemyShot.isLive=false;
						
					}
						break;
					case 3: if(enemyShot.x>a*28&&enemyShot.x<a*28+28&&enemyShot.y<b*28+28
							&&enemyShot.y>b*28-5){
						enemyShot.isLive=false;
						
					}
						break;

					default:
						break;
					}
             }
         }
   		  }
         }
         }
	 }
       
    }
 //判断己方坦克子弹打墙
 public void myShotIsHitWall() {
	 for (int i = 0; i < hero.shotBox.size(); i++) {
         Shot myShot = hero.shotBox.get(i);
        //遍历自己坦克子弹数组
         if (myShot.isLive) { 
             // 判断自己子弹是否存活
        	 
   		  for (int a = 0; a < WallSetting.MAP.length; a++) {
   				for (int b = 0; b < 25; b++) {
   				 //遍历整个地图
                 if(WallSetting.MAP[a][b] == WallSetting.BRICK
                		 ||WallSetting.MAP[a][b] == WallSetting.BOSS){
//                	 
                	switch (myShot.Direct) {
					case 0: if(myShot.x>a*28-5&&myShot.x<a*28+28&&myShot.y<b*28+28
							&&myShot.y>b*28){
						myShot.isLive=false;
						WallSetting.MAP[a][b]=5;
						 Bomb c = new Bomb(a*28, b*28);
			                bombs.add(c);
			                Sound.bombMusic();//击碎墙体发出爆炸音效
					}
						break;
					case 1: if(myShot.x>a*28-5&&myShot.x<a*28+28&&myShot.y<b*28+28
							&&myShot.y>b*28){
						myShot.isLive=false;
						WallSetting.MAP[a][b]=5;
						 Bomb c = new Bomb(a*28, b*28);
			                bombs.add(c);
			                Sound.bombMusic();//击碎墙体发出爆炸音效
					}
						break;
					case 2: if(myShot.x>a*28&&myShot.x<a*28+28&&myShot.y<b*28+28
							&&myShot.y>b*28-5){
						myShot.isLive=false;
						WallSetting.MAP[a][b]=5;
						 Bomb c = new Bomb(a*28, b*28);
			                bombs.add(c);
			                Sound.bombMusic();//击碎墙体发出爆炸音效
					}
						break;
					case 3: if(myShot.x>a*28&&myShot.x<a*28+28&&myShot.y<b*28+28
							&&myShot.y>b*28-5){
						myShot.isLive=false;
						WallSetting.MAP[a][b]=5;
						 Bomb c = new Bomb(a*28, b*28);
			                bombs.add(c);
			                Sound.bombMusic();//击碎墙体发出爆炸音效
					}
						break;

					default:
						break;
					}
                	 
             }else if(WallSetting.MAP[a][b] == WallSetting.BORDER  ){//子弹打铁块
            	 switch (myShot.Direct) {
					case 0: if(myShot.x>a*28-5&&myShot.x<a*28+28&&myShot.y<b*28+28
							&&myShot.y>b*28){
						myShot.isLive=false;
					}
						break;
					case 1: if(myShot.x>a*28-5&&myShot.x<a*28+28&&myShot.y<b*28+28
							&&myShot.y>b*28){
						myShot.isLive=false;
						
					}
						break;
					case 2: if(myShot.x>a*28&&myShot.x<a*28+28&&myShot.y<b*28+28
							&&myShot.y>b*28-5){
						myShot.isLive=false;
						
					}
						break;
					case 3: if(myShot.x>a*28&&myShot.x<a*28+28&&myShot.y<b*28+28
							&&myShot.y>b*28-5){
						myShot.isLive=false;
						
					}
						break;

					default:
						break;
					}
             }
         }
   		  }
         }
	 }
       
    }
 //判断己方坦克是否踩着地雷
 	public void heroIsHitBoom() {
 		 
		  for (int i = 0; i < WallSetting.MAP.length-1; i++) {
				for (int j = 0; j < 25; j++) {
					if (WallSetting.MAP[i][j] == WallSetting.BOOM     
							) {
						
						switch (hero.Direct) {
						case 0:if(hero.x>i*28-34&&hero.x<i*28+28
								&&hero.y>j*28&&hero.y<j*28+28){
							hero.isLive=false;
							WallSetting.MAP[i][j] = 5;
							Bomb c = new Bomb(i*28, j*28);//如果踩到，出现爆炸
			                bombs.add(c);
			                Sound.bombMusic();//踩到地雷发出爆炸音效
			                }
						
							break;
						case 1:if(hero.x>i*28-34&&hero.x<i*28+28
								&&hero.y<j*28&&hero.y>j*28-34){
							hero.isLive=false;
							WallSetting.MAP[i][j] = 5;
							Bomb c = new Bomb(i*28, j*28);
			                bombs.add(c);
			                Sound.bombMusic();//踩到地雷发出爆炸音效
			                }
							break;
						case 2:if(hero.x<i*28+28&&hero.x>i*28
								&&j*28-34<hero.y&&hero.y<j*28+28){
							hero.isLive=false;
							WallSetting.MAP[i][j] = 5;
							Bomb c = new Bomb(i*28, j*28);
			                bombs.add(c);
			                Sound.bombMusic();//踩到地雷发出爆炸音效
			                }
							break;
						case 3:if(hero.x+34>i*28&&hero.x+34<i*28+28
								&&j*28-34<hero.y&&hero.y<j*28+28){
							hero.isLive=false;
							WallSetting.MAP[i][j] = 5;
							Bomb c = new Bomb(i*28, j*28);
			                bombs.add(c);
			                Sound.bombMusic();//踩到地雷发出爆炸音效
			                }
							break;
						
						}
					}
				}
			}
}
 	//判断敌方坦克是否踩到地雷，踩到则累加器+1
 	public void etIsHitBoom() {
 		 for (int a = 0; a < enemyTanks.size(); a++) {
 	         
 	         EnemyTank et = enemyTanks.get(a);//遍历敌方所有坦克
		  for (int i = 0; i < WallSetting.MAP.length-1; i++) {
				for (int j = 0; j < 25; j++) {
					if (WallSetting.MAP[i][j] == WallSetting.BOOM     
							) {
						
						switch (et.Direct) {
						case 0:if(et.x>i*28-34&&et.x<i*28+28
								&&et.y>j*28&&et.y<j*28+28){
							et.isLive=false;
							WallSetting.MAP[i][j] = 5;
							Bomb c = new Bomb(i*28, j*28);
			                bombs.add(c);
			                Bomb d = new Bomb(et.x, et.y);
			                bombs.add(d);
			                count++;
			                }
						
							break;
						case 1:if(et.x>i*28-34&&et.x<i*28+28
								&&et.y<j*28&&et.y>j*28-34){
							et.isLive=false;
							WallSetting.MAP[i][j] = 5;
							Bomb c = new Bomb(i*28, j*28);
			                bombs.add(c);
			                Bomb d = new Bomb(et.x, et.y);
			                bombs.add(d);
			                count++;
			                }
							break;
						case 2:if(et.x<i*28+28&&et.x>i*28
								&&j*28-34<et.y&&et.y<j*28+28){
							et.isLive=false;
							WallSetting.MAP[i][j] = 5;
							Bomb c = new Bomb(i*28, j*28);
			                bombs.add(c);
			                Bomb d = new Bomb(et.x, et.y);
			                bombs.add(d);
			                count++;
			                }
							break;
						case 3:if(et.x+34>i*28&&et.x+34<i*28+28
								&&j*28-34<et.y&&et.y<j*28+28){
							et.isLive=false;
							WallSetting.MAP[i][j] = 5;
							Bomb c = new Bomb(i*28, j*28);
			                bombs.add(c);
			                Bomb d = new Bomb(et.x, et.y);
			                bombs.add(d);
			                count++;
			                }
							break;
						}
						}
					}
				}
			}
}
    public void drawMyTank(int x, int y,Graphics g,int direct) {
		//画己方坦克的方法
		
		switch (direct) {
		case 0:this.getImg(x,y,g, "tankU.gif");
			break;
		case 1:this.getImg(x,y,g, "tankD.gif");
		break;
		case 2:this.getImg(x,y,g, "tankL.gif");
		break;
		case 3:this.getImg(x,y,g, "tankR.gif");
		break;
		default:this.getImg(x,y,g, "tankU.gif");
			break;
		}
	}
    public void drawEnemyTank(int x, int y,Graphics g,int direct) {
		//画敌人坦克的方法
		switch (direct) {
		case 0:this.getImg(x,y,g, "HtankU.gif");
			break;
		case 1:this.getImg(x,y,g, "HtankD.gif");
		break;
		case 2:this.getImg(x,y,g, "HtankL.gif");
		break;
		case 3:this.getImg(x,y,g, "HtankR.gif");
		break;
		default:this.getImg(x,y,g, "HtankU.gif");
			break;
		}
	}
    public void getImg(int x, int y,Graphics g,String name){
		Image img = Toolkit.getDefaultToolkit().getImage(
				MyPanel.class.getClassLoader().getResource("images/"+name));
		g.drawImage(img, x, y, this);

	}
   

   
    public void keyTyped(KeyEvent e) {
    }

    //键盘事件控制坦克移动与射击
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W ) {
        	if(hero.getY()<0){//判断坦克是否出边界
        		hero.setY(0);
        	}
            hero.setDirect(0);
         
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
        	if(hero.getY()>670){
        		hero.setY(670);
        	}
            hero.setDirect(1);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
        	if(hero.getX()<0){
        		hero.setX(0);
        	}
            hero.setDirect(2);
            hero.moveLeft();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
        	if(hero.getX()>970){
        		hero.setX(970);
        	}
            hero.setDirect(3);
            hero.moveRight();
        }
        if (e.getKeyCode() == KeyEvent.VK_J) {
             Sound.fireMusic();//开火音效
            if (hero.shotBox.size() <= 20) {
                hero.shotEnemy();
            }
        }
        
        if (e.getKeyCode() == KeyEvent.VK_UP) {
        	image9 = Toolkit.getDefaultToolkit().getImage(
                    MyPanel.class.getResource("/images/select1.png"));
        }
        
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            image9=Toolkit.getDefaultToolkit().getImage(
                    MyPanel.class.getResource("/images/select2.png"));
        }
        
       
        
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {  
            if(image9.toString().equals(image10.toString())) {
            	JOptionPane.showMessageDialog(null,"余额不足，请充值!"); 
            }
            else
            {
            	k=1;
            }
        }
        
      
        if(hero.isLive)
        	repaint();
    }


    public void keyReleased(KeyEvent e) {
    }

   
    public void run() {
      
        while (true) {
            try {
                Thread.sleep(100);//每隔100毫秒重画一次
            } catch (Exception e) {
                e.printStackTrace();
            }
            hitEnemyTank();//己方子弹打敌方坦克的方法
            hitMe();//敌方子弹打我方坦克方法
            myShotIsHitWall();//己方子弹打墙方法
            etShotIsHitWall();//敌方子弹打墙方法
            heroIsHitBoom();//己方坦克踩到地雷方法
            etIsHitBoom();//敌方坦克踩到地雷方法
         
            repaint();
        }
    }
}
