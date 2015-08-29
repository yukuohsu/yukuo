package Specialtopic;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class EX1 extends JFrame {
	private int flag = 1;
	private JLabel jlb1 = new JLabel();
	private JLabel jlb2 = new JLabel();
	private JPanel jp = new GPanel();
	private Container cp;
	private String str = "請開始下五子棋";
	private JLabel jlbN = new JLabel(str);
	private JLabel jlbC = new JLabel();
	private JPanel jpnE = new JPanel();
	private JButton jbtn3 = new JButton("重新開始");
	private JButton jbtnExit = new JButton("Exit");

	static int allCheese[][] = new int[20][20];

	public EX1() {
		initComp();
	}

	private void initComp() {

		for (int i = 0; i < allCheese.length; i++) {

			for (int j = 0; j < allCheese[i].length; j++) {

				allCheese[i][j] = 0;
			}

		}

		this.setTitle("五子棋遊戲(國霖年代)");
		this.setResizable(false);
		cp = this.getContentPane();
		this.setBounds(50, 50, 1200, 900);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setLayout(new BorderLayout());
		jlbN.setFont(new Font("Serief", Font.ITALIC + Font.BOLD, 40));
		jlbN.setBackground(Color.yellow);
		jlbN.setHorizontalAlignment(JLabel.CENTER);
		jpnE.setLayout(new GridLayout(5, 1, 3, 3));
		jpnE.add(jbtn3);
		jpnE.add(jbtnExit);
		jbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				for (int i = 0; i < allCheese.length; i++) {

					for (int j = 0; j < allCheese[i].length; j++) {

						allCheese[i][j] = 0;
					}

				}

				Graphics g = jp.getGraphics();
				g.clearRect(0, 0, jp.getWidth(), jp.getHeight());

				for (int i = 0; i <= 400; i += 20) {
					g.drawLine(0, i, 400, i);
					g.drawLine(i, 0, i, 400);

				}

				g.setColor(Color.green);
				g.drawRect(0, 0, jp.getWidth(), jp.getHeight());
				flag = 1;
			}
		});

		cp.add(jp, BorderLayout.CENTER);
		cp.add(jlbN, BorderLayout.NORTH);
		cp.add(jpnE, BorderLayout.EAST);
		jp.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				Graphics g = jp.getGraphics();

				int x = e.getX();
				int y = e.getY();
				int a = (int) x / 20;
				int b = (int) y / 20;
				System.out.println(a + "  " + b);

				if (allCheese[a][b] == 0) {

					if (flag == 1) {
						g.setColor(Color.black);
						g.fillOval((2 + (a * 20)), (2 + (b * 20)), 16, 16);
						allCheese[a][b] = 1;

					} else {
						g.setColor(Color.red);
						g.fillOval((2 + (a * 20)), (2 + (b * 20)), 16, 16);
						allCheese[a][b] = 2;
					}

					// ----------------------------------

					if (a > 1 && a < 18) {

						if (allCheese[a][b] == flag
								&& allCheese[a - 1][b] == flag
								&& allCheese[a - 2][b] == flag
								&& allCheese[a + 1][b] == flag
								&& allCheese[a + 2][b] == flag) {
							win();
						}

					}
					if (a > 1 && a < 18 && b > 1 && b < 18) {

						if (allCheese[a + 2][b + 2] == flag
								&& allCheese[a + 1][b + 1] == flag
								&& allCheese[a][b] == flag
								&& allCheese[a - 1][b - 1] == flag
								&& allCheese[a - 2][b - 2] == flag) {
							win();
						}
					}
					if (a > 1 && a < 18 && b > 1 && b < 18) {

						if (allCheese[a + 2][b - 2] == flag
								&& allCheese[a + 1][b - 1] == flag
								&& allCheese[a][b] == flag
								&& allCheese[a - 1][b + 1] == flag
								&& allCheese[a - 2][b + 2] == flag) {
							win();
						}
					}
					if (b > 1 && b < 18) {

						if (allCheese[a][b] == flag
								&& allCheese[a][b - 1] == flag
								&& allCheese[a][b - 2] == flag
								&& allCheese[a][b + 1] == flag
								&& allCheese[a][b + 2] == flag) {
							win();
						}
					}
					if (a > -1 && a < 16) {

						if (allCheese[a][b] == flag
								&& allCheese[a + 4][b] == flag
								&& allCheese[a + 3][b] == flag
								&& allCheese[a + 2][b] == flag
								&& allCheese[a + 1][b] == flag) {
							win();
						}
					}
					if (a > 3 && a < 20) {

						if (allCheese[a][b] == flag
								&& allCheese[a - 1][b] == flag
								&& allCheese[a - 2][b] == flag
								&& allCheese[a - 3][b] == flag
								&& allCheese[a - 4][b] == flag) {
							win();
						}
					}
					if (b > 3 && b < 20) {

						if (allCheese[a][b] == flag
								&& allCheese[a][b - 1] == flag
								&& allCheese[a][b - 2] == flag
								&& allCheese[a][b - 3] == flag
								&& allCheese[a][b - 4] == flag) {
							win();
						}
					}
					if (b > -1 && b < 16) {

						if (allCheese[a][b] == flag
								&& allCheese[a][b + 1] == flag
								&& allCheese[a][b + 2] == flag
								&& allCheese[a][b + 3] == flag
								&& allCheese[a][b + 4] == flag) {
							win();
						}
					}
					if (a > 3 && a < 20 && b > -1 && b < 16) {

						if (allCheese[a][b] == flag
								&& allCheese[a - 1][b + 1] == flag
								&& allCheese[a - 2][b + 2] == flag
								&& allCheese[a - 3][b + 3] == flag
								&& allCheese[a - 4][b + 4] == flag) {
							win();
						}
					}
					if (a > -1 && a < 16 && b > -1 && b < 16) {

						if (allCheese[a][b] == flag
								&& allCheese[a + 1][b + 1] == flag
								&& allCheese[a + 2][b + 2] == flag
								&& allCheese[a + 3][b + 3] == flag
								&& allCheese[a + 4][b + 4] == flag) {
							win();
						}
					}
					if (a > 3 && a < 20 && b > 3 && b < 20) {

						if (allCheese[a][b] == flag
								&& allCheese[a - 1][b - 1] == flag
								&& allCheese[a - 2][b - 2] == flag
								&& allCheese[a - 3][b - 3] == flag
								&& allCheese[a - 4][b - 4] == flag) {
							win();
						}
					}
					if (allCheese[a][b] == flag
							&& allCheese[a - 1][b + 1] == flag
							&& allCheese[a - 2][b + 2] == flag
							&& allCheese[a - 3][b + 3] == flag
							&& allCheese[a - 4][b + 4] == flag) {
						win();
					}
					if (a > 0 && a < 17) {

						if (allCheese[a][b] == flag
								&& allCheese[a - 1][b] == flag
								&& allCheese[a + 1][b] == flag
								&& allCheese[a + 2][b] == flag
								&& allCheese[a + 3][b] == flag) {
							win();
						}
					}
					if (a > 2 && a < 19) {

						if (allCheese[a][b] == flag
								&& allCheese[a + 1][b] == flag
								&& allCheese[a - 1][b] == flag
								&& allCheese[a - 2][b] == flag
								&& allCheese[a - 3][b] == flag) {
							win();
						}
					}
					if (b > 2 && b < 19) {

						if (allCheese[a][b] == flag
								&& allCheese[a][b + 1] == flag
								&& allCheese[a][b - 1] == flag
								&& allCheese[a][b - 2] == flag
								&& allCheese[a][b - 3] == flag) {
							win();
						}
					}
					if (b > 0 && b < 17) {

						if (allCheese[a][b] == flag
								&& allCheese[a][b - 1] == flag
								&& allCheese[a][b + 1] == flag
								&& allCheese[a][b + 2] == flag
								&& allCheese[a][b + 3] == flag) {
							win();
						}
					}
					if (a > 0 && a < 17 && b > 2 && b < 19) {

						if (allCheese[a][b] == flag
								&& allCheese[a - 1][b + 1] == flag
								&& allCheese[a + 1][b - 1] == flag
								&& allCheese[a + 2][b - 2] == flag
								&& allCheese[a + 3][b - 3] == flag) {
							win();
						}
					}
					if (a > 0 && a < 17 && b > 0 && b < 17) {

						if (allCheese[a][b] == flag
								&& allCheese[a - 1][b - 1] == flag
								&& allCheese[a + 1][b + 1] == flag
								&& allCheese[a + 2][b + 2] == flag
								&& allCheese[a + 3][b + 3] == flag) {
							win();
						}
					}
					if (a > 2 && a < 19 && b > 2 && b < 19) {

						if (allCheese[a][b] == flag
								&& allCheese[a + 1][b + 1] == flag
								&& allCheese[a - 1][b - 1] == flag
								&& allCheese[a - 2][b - 2] == flag
								&& allCheese[a - 3][b - 3] == flag) {
							win();
						}
					}
					if (a > 2 && a < 19 && b > 0 && b < 17) {

						if (allCheese[a][b] == flag
								&& allCheese[a + 1][b - 1] == flag
								&& allCheese[a - 1][b + 1] == flag
								&& allCheese[a - 2][b + 2] == flag
								&& allCheese[a - 3][b + 3] == flag) {

							win();
						}
					}
					if (flag == 1) {
						flag = 2;

					} else {
						flag = 1;
					}

				}

			}

			public void mousePressed(MouseEvent evt) {

			}

			public void mouseReleased(MouseEvent evt) {

			}
		});
		pack();
	}

	public void paintComponent(Graphics g2) {
		for (int i = 0; i <= 400; i += 20) {
			g2.drawLine(0, i, 400, i);
			g2.drawLine(i, 0, i, 400);
		}
	}

	public void win() {

		if (flag == 1) {

			JOptionPane.showMessageDialog(null, "黑棋 獲勝");

		} else {

			JOptionPane.showMessageDialog(null, "紅棋獲勝");

		}

		for (int i = 0; i < allCheese.length; i++) {

			for (int j = 0; j < allCheese[i].length; j++) {

				allCheese[i][j] = 0;
			}

		}

		Graphics g = jp.getGraphics();
		g.clearRect(0, 0, jp.getWidth(), jp.getHeight());

		for (int i = 0; i <= 400; i += 20) {
			g.drawLine(0, i, 400, i);
			g.drawLine(i, 0, i, 400);

		}

		g.drawRect(0, 0, jp.getWidth(), jp.getHeight());
		flag = 1;
	}

}

class GPanel extends JPanel {
	public GPanel() {
		setPreferredSize(new Dimension(400, 400));
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		
		g.drawRect(0, 0, getWidth(), getHeight());

		g.setColor(Color.black);
		for (int i = 0; i <= 400; i += 20) {
			g.drawLine(0, i, 400, i);
			g.drawLine(i, 0, i, 400);
		}
	}
}