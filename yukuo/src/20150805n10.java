package y20150805;
import java.util.Scanner;
public class y20150805n10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入上學期的學分");
        int a = scn.nextInt();
        System.out.println("請輸入下學期的學分");
        int b = scn.nextInt();
        if(a+b>=22){
        	System.out.println("在學");
        }else{
        	System.out.println("退學");
        
        }
	}

}
