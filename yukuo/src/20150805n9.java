package y20150805;
import java.util.Scanner;
public class y20150805n9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�̵u�����");
		double a = scn.nextInt();
		System.out.println("�п�J�ĤG�������");
		int b = scn.nextInt();
		System.out.println("�п�J�̪������");
		int c = scn.nextInt();
		if(a*a+b*b==c*c){
		System.out.println("���T���ά������T����");
	}else{
		if(a*a+b*b>c*c){
			System.out.println("���T���ά��U���T����");
		}else{
			if(a*a+b*b<c*c){
				System.out.println("���T���ά��w���T����");
			}
		}
	}

	}

}
