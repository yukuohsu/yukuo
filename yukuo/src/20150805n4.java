package y20150805;
import java.util.Scanner;
public class y20150805n4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入國文成績");
        int c = scn.nextInt();
        System.out.println("請輸入英文成績");
        int e = scn.nextInt();
        System.out.println("請輸入數學成績");
        int m = scn.nextInt();
        int a;
        float o;
        a = c+e+m ;
        o = (c+e+m)/3;
        System.out.println("您的總成績為"+a+"您的各科平均成績為"+o);
	}

}
