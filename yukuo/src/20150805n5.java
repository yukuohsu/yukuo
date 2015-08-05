package y20150805;
import java.util.Scanner;
public class y20150805n5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入 A 值");
        int a = scn.nextInt();
        System.out.println("請輸入 B 值");
        int b = scn.nextInt();
        int h ;
        int z ;
        int c ;
        h = a+b;
        z = a-b;
        c = a*b;
        System.out.println("合為="+h+"差為="+z+"乘積為="+c);
	}

}
