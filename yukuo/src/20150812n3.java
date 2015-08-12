package y20150812;
import java.util.Scanner;
public class y20150812n3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一正整數");
		int a = scn.nextInt();
		int i = 1;
		long sum = 1;
		while(i<=a){
		sum=sum*i;
		i++;
		}
		System.out.println(a+"!="+sum);

	}

}
