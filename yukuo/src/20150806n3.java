package y20150806;
import java.util.Scanner;
public class y20150806n3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入13");
		int n = scn.nextInt();
		int i ;
		int sum = 0;
		for(i=n;i>=13 && i<=1399;i=i+1){
           sum=sum+i;
		}
           System.out.println("sum="+sum);

	}

}
