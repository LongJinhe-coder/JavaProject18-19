package cn.matianhe.tankwar;

import java.util.Vector;

class EnemyTank extends Tank implements Runnable {
	

	int time = 0;
	
	Vector<EnemyTank> ets = new Vector<EnemyTank>();//敌人坦克数组
	
	Vector<Shot> ss = new Vector<Shot>();//敌人子弹数组

	
	public EnemyTank(int x, int y) {
		super(x, y);
	}

	
	public void setEts(Vector<EnemyTank> vv) {
		this.ets = vv;
	}

	//判断敌方坦克是否相互碰撞
	public boolean isTouchOtherEnemy() {
		boolean b = false;

		switch (Direct) {
		case 0:
			//遍历每一辆敌方坦克
			for (int i = 0; i < ets.size(); i++) {
				
				EnemyTank et = ets.get(i);
				
				if (et != this) {//判断不是自身坦克
					
					if (et.Direct == 0 || et.Direct == 1) {
						if (x >= et.x && x <= et.x + 34 && y >= et.y && y <= et.y + 34) {
							return true;
						}
						if (x + 34 >= et.x && x + 34 <= et.x + 34 && y >= et.y && y <= et.y + 34) {
							return true;
						}
					}
					if (et.Direct == 3 || et.Direct == 2) {
						if (x >= et.x && x <= et.x + 34 && y >= et.y && y <= et.y + 34) {
							return true;
						}
						if (x + 34 >= et.x && x + 34 <= et.x + 34 && y >= et.y && y <= et.y + 34) {
							return true;
						}
					}
				}
			}
			break;
		case 1:
			
			for (int i = 0; i < ets.size(); i++) {
				
				EnemyTank et = ets.get(i);
				
				if (et != this) {
					
					if (et.Direct == 0 || et.Direct == 1) {
						if (x >= et.x && x <= et.x + 34 && y + 34 >= et.y && y + 34 <= et.y + 34) {
							return true;
						}
						if (x + 34 >= et.x && x + 34 <= et.x + 34 && y + 34 >= et.y && y + 34 <= et.y + 34) {
							return true;
						}
					}
					if (et.Direct == 3 || et.Direct == 2) {
						if (x >= et.x && x <= et.x + 34 && y + 34 >= et.y && y + 34 <= et.y + 34) {
							return true;
						}
						if (x + 34 >= et.x && x + 34 <= et.x + 34 && y + 34 >= et.y && y + 34 <= et.y + 34) {
							return true;
						}
					}
				}
			}

			break;
		case 2:
			
			for (int i = 0; i < ets.size(); i++) {
				
				EnemyTank et = ets.get(i);
				
				if (et != this) {
					
					if (et.Direct == 0 || et.Direct == 1) {
						if (x >= et.x && x <= et.x + 34 && y >= et.y && y <= et.y + 34) {
							return true;
						}
						if (x >= et.x && x <= et.x + 34 && y + 34 >= et.y && y + 34 <= et.y + 34) {
							return true;
						}
					}
					if (et.Direct == 3 || et.Direct == 2) {
						if (x >= et.x && x <= et.x + 34 && y >= et.y && y <= et.y + 34) {
							return true;
						}
						if (x >= et.x && x <= et.x + 34 && y + 34 >= et.y && y + 34 <= et.y + 34) {
							return true;
						}
					}
				}
			}

			break;
		case 3:
			
			for (int i = 0; i < ets.size(); i++) {
				
				EnemyTank et = ets.get(i);
				
				if (et != this) {
					
					if (et.Direct == 0 || et.Direct == 1) {
						if (x + 34 >= et.x && x + 34 <= et.x + 34 && y >= et.y && y <= et.y + 34) {
							return true;
						}
						if (x + 34 >= et.x && x + 34 <= et.x + 34 && y + 34 >= et.y && y + 34 <= et.y + 34) {
							return true;
						}
					}
					if (et.Direct == 2 || et.Direct == 3) {
						if (x + 34 >= et.x && x + 34 <= et.x + 34 && y >= et.y && y <= et.y + 34) {
							return true;
						}
						if (x + 34 >= et.x && x + 34<= et.x + 34 && y + 34 >= et.y && y + 34 <= et.y + 34) {
							return true;
						}
					}
				}
			}
			break;

		default:
			break;
		}
		return b;
	}

	//敌方坦克的run方法
	public void run() {
		while (true) {
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
			switch (Direct) {
			case 0:
				for (int i = 0; i < 3; i++) {
					if (y > 0 && !isTouchOtherEnemy()&&!isCrashWall(x, y))//若出边界或与其他坦克及墙相碰，则不再朝原方向前进
						y -= speed;
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				

				break;
			case 1:
				for (int i = 0; i < 3; i++) {
					if (y < 640 && !isTouchOtherEnemy()&&!isCrashWall(x, y))
						y += speed;
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				break;
			case 2:
				for (int i = 0; i < 3; i++) {
					if (x > 0 && !isTouchOtherEnemy()&&!isCrashWall(x, y))
						x -= speed;
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				break;
			case 3:
				for (int i = 0; i < 3; i++) {
					if (x < 640 && !isTouchOtherEnemy()&&!isCrashWall(x, y))
						x += speed;
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				break;
			default:
				break;
			}

			time++;
			//如果time%2==0,且坦克还存活，其子弹数量小于8，则根据坦克当前方法发射子弹
			if (time % 2 == 0) {
				if (isLive) {
					if (ss.size() < 8) {
						Shot s = null;
						
						switch (Direct) {

						case 0:
							
							s = new Shot(x + 8, y - 4, 0);
							
							ss.add(s);
							break;
						case 1:
							s = new Shot(x + 9, y + 32, 1);
							ss.add(s);
							break;
						case 2:
							s = new Shot(x - 8, y + 8, 2);
							ss.add(s);
							break;
						case 3:
							s = new Shot(x + 32, y + 9, 3);
							ss.add(s);
							break;
						default:
							break;
						}
						
						Thread t = new Thread(s);
						t.start();//启动子弹线程
					}
				}
			}

			
			Direct = (int) (Math.random() * 4);//随机生成坦克方向
			
			if (isLive == false) {
				
				break;//若坦克失活，则跳出循环
			}

		}
	}
}
