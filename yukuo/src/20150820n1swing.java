package y20150820;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class swing extends JFrame{
		private JButton jbtnExit = new JButton("Exit"); //Exit�����s
		private JButton jbtnPush = new JButton("Push"); //Push�����s
		private JButton jbtnBack = new JButton("Back"); //Back�����s
		private JLabel jlb1 = new JLabel(); //���Ҫ���
		private Container cp; //�ŧi�@�ӵ����e��
		private String str = "��Push���s����:";
		private int count = 0;
		
		public swing(){ //�������O���غc��
		initComp(); //�I�sinitComp �禡�Hø�s�����˦�	
		}
		private void initComp(){
			cp=this.getContentPane(); //���o�������e�� �Ψө�m�U�ؤ���
			this.setBounds(150,100,600,400); //�]�w��������ܰ_�l��m�P�����j�p
			this.setDefaultCloseOperation(EXIT_ON_CLOSE); //�]�w������X�N��������
			cp.setLayout(null); //���ϥε����G�����O
			
			//---------�]�w����---------
			jlb1.setBounds(50,70,250,25); //�]�w���Ҫ���b�����W����m�P���Ҥj�p
			jlb1.setText(str + count); //�]�w���ҤW��ܪ��r
			cp.add(jlb1); //�N���Ҫ���[������e����
			
			//---------�]�wPush���s---------
			jbtnPush.setBounds(50,100,80,25); //�]�wPush�b�����W����m�P�j�p
			cp.add(jbtnPush); //�NPush���s�[������e����
			jbtnPush.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					count++;
					jlb1.setText(str + count); //��s���ҤW��ܪ���r
				}
			});
			
			//---------�]�wBack���s---------
			jbtnBack.setBounds(150,100,80,25); //�]�wBack�b�����W����m�P�j�p
			cp.add(jbtnBack); //�NBack���s�[������e����
			jbtnBack.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					count--;
					jlb1.setText(str + count); //��s���ҤW��ܪ���r					
				}
			});
			
			//---------�]�wExit���s---------
			jbtnExit.setBounds(50,150,80,25); //�]�wExit�b�����W����m�P�j�p
			cp.add(jbtnExit); //�NExit���s�[������e����
			jbtnExit.addActionListener(new ActionListener(){ //��Exit���s�[�J�ƥ�B�z
				public void actionPerformed(ActionEvent ae){
					System.exit(0);
				}
			});
			
			jlb1.setLayout(null);
			cp.setBackground(Color.black); //�����I���C��
			jlb1.setForeground(Color.pink); //���Ҥ�r�C��
			jlb1.setSize(200,20); 
			jlb1.setFont(50);
		}
}
