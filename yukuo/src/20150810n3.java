package y20150810;
import java.util.Scanner;
public class y20150810n3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int w = 0;
		int t = 0;
		while(w<600){
			System.out.println("�п�J�o�ʾ�ĤU�Ӫ��s�����q(����)");
			int a = scn.nextInt();
			w=w+a;
			t++;
		}
		System.out.println("�`�@�ĤF"+t+"���s����Ӷ���30�c�A�`���q��"+w+"����");

	}

}
