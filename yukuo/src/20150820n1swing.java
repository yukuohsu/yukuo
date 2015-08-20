package y20150820;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class swing extends JFrame{
		private JButton jbtnExit = new JButton("Exit"); //Exit的按鈕
		private JButton jbtnPush = new JButton("Push"); //Push的按鈕
		private JButton jbtnBack = new JButton("Back"); //Back的按鈕
		private JLabel jlb1 = new JLabel(); //標籤物件
		private Container cp; //宣告一個視窗容器
		private String str = "按Push按鈕次數:";
		private int count = 0;
		
		public swing(){ //視窗類別的建構元
		initComp(); //呼叫initComp 函式以繪製視窗樣式	
		}
		private void initComp(){
			cp=this.getContentPane(); //取得視窗的容器 用來放置各種元件
			this.setBounds(150,100,600,400); //設定視窗的顯示起始位置與視窗大小
			this.setDefaultCloseOperation(EXIT_ON_CLOSE); //設定視窗按X就結束執行
			cp.setLayout(null); //不使用視窗佈局類別
			
			//---------設定標籤---------
			jlb1.setBounds(50,70,250,25); //設定標籤物件在視窗上的位置與標籤大小
			jlb1.setText(str + count); //設定標籤上顯示的字
			cp.add(jlb1); //將標籤物件加到視窗容器中
			
			//---------設定Push按鈕---------
			jbtnPush.setBounds(50,100,80,25); //設定Push在視窗上的位置與大小
			cp.add(jbtnPush); //將Push按鈕加到視窗容器中
			jbtnPush.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					count++;
					jlb1.setText(str + count); //更新標籤上顯示的文字
				}
			});
			
			//---------設定Back按鈕---------
			jbtnBack.setBounds(150,100,80,25); //設定Back在視窗上的位置與大小
			cp.add(jbtnBack); //將Back按鈕加到視窗容器中
			jbtnBack.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					count--;
					jlb1.setText(str + count); //更新標籤上顯示的文字					
				}
			});
			
			//---------設定Exit按鈕---------
			jbtnExit.setBounds(50,150,80,25); //設定Exit在視窗上的位置與大小
			cp.add(jbtnExit); //將Exit按鈕加到視窗容器中
			jbtnExit.addActionListener(new ActionListener(){ //為Exit按鈕加入事件處理
				public void actionPerformed(ActionEvent ae){
					System.exit(0);
				}
			});
			
			jlb1.setLayout(null);
			cp.setBackground(Color.black); //視窗背景顏色
			jlb1.setForeground(Color.pink); //標籤文字顏色
			jlb1.setSize(200,20); 
			jlb1.setFont(50);
		}
}
