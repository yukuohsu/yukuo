package y20150805;
import java.util.Scanner;
public class y20150805n8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入三角形最小的邊長");
		int a = scn.nextInt();
		System.out.println("請輸入三角形第二長的邊長");
		int b = scn.nextInt();
		System.out.println("請輸入三角形最長的邊長");
		int c = scn.nextInt();
		if(c<a+b){
			System.out.println("合法三角形");
		}else{
			if(c>a+b){
				System.out.println("不合法三角形");
			}
				
		}

	}

}
