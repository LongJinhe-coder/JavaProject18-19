package text2;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestListener extends JPanel {
	
	//���췽��
	public TestListener() {
		init();
	}
	
	/**
	 * �Զ���ĳ�ʼ���ķ���
	 */
	public void init(){
		final ImageIcon icon1 = new ImageIcon("image/serverstart.gif");
		final ImageIcon icon2 = new ImageIcon("image/serverstop.gif");
		final JLabel label = new JLabel();
		label.setIcon(icon1);
		//this��ָ����ǰ����panel�����ڼ̳���JPanel����panel����һ�����
		// ��label��ӵ������
		this.add(label);
		//����������  ʹ��������
		MouseAdapter adapter = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("������¼�");
			}
			@Override
			public void mousePressed(MouseEvent e) {
			    System.out.println("����pressed�¼�");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("��������¼�");
				label.setIcon(icon2);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("����Ƴ��¼�");
				label.setIcon(icon1);
			}
		};
		
		//��label�󶨼���
		label.addMouseListener(adapter);
	}
	
	
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("������");
        TestListener panel = new TestListener();
        jFrame.add(panel);
		// ���ô���Ĵ�С
		jFrame.setSize(500, 500);
		// ���ùرշ�ʽ
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �����м���ʾ
		jFrame.setLocationRelativeTo(null);
		// ���ô�С���ɱ�
		jFrame.setResizable(false);
		Image image = new ImageIcon("image/face0.gif").getImage();
		jFrame.setIconImage(image);
		// ���ô���ɼ�
		jFrame.setVisible(true);
	}
}
