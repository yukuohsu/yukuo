package y20150810;
import java.util.Scanner;
public class y20150810n2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int w = 390;
		int m = 0;
		while(w<500){
			System.out.println("�o�Ӥp���x�F�h�֤�����?");
			int a = scn.nextInt();
			w=w+a;
			m++;
		}
		System.out.println("�Ȭw���w��F"+m+"�Ӥ��x�s��500�U�������A�{�b���q��"+w+"����");
		}
	}