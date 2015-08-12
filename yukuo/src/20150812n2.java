package y20150812;
import java.util.Scanner;
public class y20150812n2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一正整數");
		int a = scn.nextInt();
		int i;
		long sum=1;
		for(i=1;i<=a;i++){
		sum=sum*i;
		}
		System.out.println(a+"!="+sum);

	}

}
