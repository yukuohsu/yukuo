package y20150805;
import java.util.Scanner;
public class y20150805n9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入最短的邊長");
		double a = scn.nextInt();
		System.out.println("請輸入第二長的邊長");
		int b = scn.nextInt();
		System.out.println("請輸入最長的邊長");
		int c = scn.nextInt();
		if(a*a+b*b==c*c){
		System.out.println("此三角形為直角三角形");
	}else{
		if(a*a+b*b>c*c){
			System.out.println("此三角形為銳角三角形");
		}else{
			if(a*a+b*b<c*c){
				System.out.println("此三角形為鈍角三角形");
			}
		}
	}

	}

}
