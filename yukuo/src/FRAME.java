import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FRAME extends JFrame {
	private JLabel jlb1 = new JLabel();
	private JLabel jlb2 = new JLabel();
	private JPanel jp = new GPanel();
	private Container cp;
	private String str = "請開始下棋";
	private JLabel jlbN = new JLabel(str);
	private JLabel jlbC = new JLabel();
	private JPanel jpnE = new JPanel();
	private JButton jbtn1 = new JButton("1");
	private JButton jbtn2 = new JButton("1");
	private JButton jbtn3 = new JButton("1");
	private JButton jbtn4 = new JButton("1");
	private JButton jbtnExit = new JButton("Exit");
	
	static int allCheese[][] = new int[20][20];

	public FRAME() {
		initComp();
	}
	
	private void initComp() {
		this.setTitle("五子棋遊戲");
		cp = this.getContentPane();
		this.setBounds(50, 50, 1200, 900);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setLayout(new BorderLayout());
		jlbN.setFont (new Font("Serief",Font.ITALIC+Font.BOLD,40));
		jlbN.setBackground(Color.yellow);
		jlbN.setHorizontalAlignment(JLabel.CENTER);
		jp.setBackground(Color.green);
		Graphics g = getGraphics();
		paint(g);
		jpnE.setLayout(new GridLayout(5, 1, 3, 3));
		jpnE.add(jbtn1);
		jpnE.add(jbtn2);
		jpnE.add(jbtn3);
		jpnE.add(jbtn4);
		jpnE.add(jbtnExit);
		jbtnExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				System.exit(0);
			}
		});
		cp.add(jp, BorderLayout.CENTER);
		cp.add(jlbN, BorderLayout.NORTH); 
		cp.add(jpnE, BorderLayout.EAST);
		jp.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			     
			}
            public void mousePressed(MouseEvent evt) {
                
            }
            public void mouseReleased(MouseEvent evt) {
                
            }
        });
		pack();
	}
	
	public void paintComponent(Graphics g2){
		for(int i=0;i<=400;i+=20){
			g2.drawLine(0,i,400,i);
			g2.drawLine(i,0,i,400);
		}
	}
}
		class GPanel extends JPanel {
    public GPanel() {
    	setPreferredSize(new Dimension(400, 400));
    }
	public void mouseClicked(MouseEvent e){
		Graphics g = getGraphics();
		paint(g);
		g.setColor(Color.WHITE);
		for(int x=70;x<=170;x+=20){
		g.fillOval(x,80,10,10);
		}
     	
     	
    }
/*    static class MouseLis extends MouseAdapter;
    {
    	public void mouseClicked(MouseEvent e){
    		int x=e.getX();
    		int y=e.getY();
    		txa.append("clicked at ("+x+","+y+")\n");
    	}
*/
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int i=0;i<=400;i+=20){
			g.drawLine(0,i,400,i);
			g.drawLine(i,0,i,400);
		}
    }
}
