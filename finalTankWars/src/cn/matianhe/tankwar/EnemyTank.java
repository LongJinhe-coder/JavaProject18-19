package cn.matianhe.tankwar;

import java.util.Vector;

class EnemyTank extends Tank implements Runnable {
	

	int time = 0;
	
	Vector<EnemyTank> ets = new Vector<EnemyTank>();//����̹������
	
	Vector<Shot> ss = new Vector<Shot>();//�����ӵ�����

	
	public EnemyTank(int x, int y) {
		super(x, y);
	}

	
	public void setEts(Vector<EnemyTank> vv) {
		this.ets = vv;
	}

	//�жϵз�̹���Ƿ��໥��ײ
	public boolean isTouchOtherEnemy() {
		boolean b = false;

		switch (Direct) {
		case 0:
			//����ÿһ���з�̹��
			for (int i = 0; i < ets.size(); i++) {
				
				EnemyTank et = ets.get(i);
				
				if (et != this) {//�жϲ�������̹��
					
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

	//�з�̹�˵�run����
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
					if (y > 0 && !isTouchOtherEnemy()&&!isCrashWall(x, y))//�����߽��������̹�˼�ǽ���������ٳ�ԭ����ǰ��
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
			//���time%2==0,��̹�˻������ӵ�����С��8�������̹�˵�ǰ���������ӵ�
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
						t.start();//�����ӵ��߳�
					}
				}
			}

			
			Direct = (int) (Math.random() * 4);//�������̹�˷���
			
			if (isLive == false) {
				
				break;//��̹��ʧ�������ѭ��
			}

		}
	}
}
