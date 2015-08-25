
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FRAME extends JFrame {
	private JLabel jlb1 = new JLabel();
	private JLabel jlb2 = new JLabel();
	private JPanel jp = new JPanel();
	private Container cp;
	private String str = "請開始下棋";
	private JLabel jlbN = new JLabel(str);
	private JLabel jlbC = new JLabel();
	private JLabel jlbE = new JLabel();

	
	
	static ImageIcon pic[] = new ImageIcon[3]; // 建立ImageIcon陣列

	public FRAME() {
		initComp();
	}
	private void initComp() {
		cp = this.getContentPane();
		this.setBounds(50, 50, 1200, 900);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setLayout(new BorderLayout());
		jlbN.setOpaque(true);
		jlbN.setFont (new Font("Serief",Font.ITALIC+Font.BOLD,40));
		jlbN.setBackground(Color.yellow);
		jlbN.setHorizontalAlignment(JLabel.CENTER);
		
		jlbC.setOpaque(true);
		((JPanel) this.getContentPane()).setOpaque(false);
		ImageIcon img = new ImageIcon("E:\\github\\yukuo\\1.png");
		JLabel jlbC = new JLabel(img);
		jlbC.setHorizontalAlignment(JLabel.CENTER);
		
		jlbE.setOpaque(true);
		jlbE.setBackground(Color.yellow);
		jlbE.setHorizontalAlignment(JLabel.CENTER);
		
		cp.add(jlbN,BorderLayout.NORTH);
		cp.add(jlbC,BorderLayout.CENTER); 
		cp.add(jlbE,BorderLayout.EAST);
	}
	

	

}
