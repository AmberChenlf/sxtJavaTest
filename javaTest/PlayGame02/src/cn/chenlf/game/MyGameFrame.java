/**
 * 
 */
package cn.chenlf.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * @author Administrator
 *
 */
public class MyGameFrame extends JFrame{

	/**
	 * ��ʼ������
	 */
	public void paint(Graphics g) {
		//������ɫ
		Color c = g.getColor();
		g.setColor(Color.BLUE);
		//��������
		Font f = g.getFont();
		super.paint(g);
		g.drawLine(100, 100, 300, 300);
		g.drawRect(100, 100, 300, 300);
		g.drawOval(100, 100, 300, 300);
		g.setColor(Color.RED);
		g.setFont(new Font("����", Font.BOLD, 50));
		g.drawString("��ඣ�", 200, 100);
		
		g.setColor(c);
		
	}
	public void lanunchFrame() {
		this.setTitle("chenlf��Ʒ");
		this.setVisible(true);
		this.setSize(500,500);
		this.setLocation(300,300);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGameFrame f = new MyGameFrame();
		f.lanunchFrame();
		

	}

}
