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
	 * 初始化窗口
	 */
	public void paint(Graphics g) {
		//更改颜色
		Color c = g.getColor();
		g.setColor(Color.BLUE);
		//更改字体
		Font f = g.getFont();
		super.paint(g);
		g.drawLine(100, 100, 300, 300);
		g.drawRect(100, 100, 300, 300);
		g.drawOval(100, 100, 300, 300);
		g.setColor(Color.RED);
		g.setFont(new Font("宋体", Font.BOLD, 50));
		g.drawString("哈喽！", 200, 100);
		
		g.setColor(c);
		
	}
	public void lanunchFrame() {
		this.setTitle("chenlf作品");
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
