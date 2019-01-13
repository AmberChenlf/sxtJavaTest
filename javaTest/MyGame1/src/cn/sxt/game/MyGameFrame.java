/**
 * 
 */
package cn.sxt.game;

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
