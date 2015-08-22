package Specialtopic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class start extends JFrame {
	private JLabel jlb1 = new JLabel();
	private JLabel jlb2 = new JLabel();
	private JPanel jp = new JPanel();
	private Container cp;
	private String str = "請開始下棋";

	static ImageIcon pic[] = new ImageIcon[3]; // «Ø¥ßImageIcon°}¦C

	public start() {
		initComp();
	}

	private void initComp() {
		cp = this.getContentPane();
		this.setBounds(150, 100, 600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setLayout(null);

		jlb1.setBounds(900, 10, 250, 100);
		jlb1.setText(str);
		cp.add(jlb1);
		jlb1.setFont (new Font("Serief",Font.ITALIC+Font.BOLD,40));

		jp.setOpaque(false);
		cp.add(jp);
		setBak();

	}

	public void setBak() {
		((JPanel) this.getContentPane()).setOpaque(false);
		ImageIcon img = new ImageIcon("E:\\github\\yukuo\\1.png");
		JLabel background = new JLabel(img);
		this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));
		background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
	}
}
