package y20150805;
import java.util.Scanner;
public class y20150805n7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入一個正整數");
        int a = scn.nextInt();
        if(a%2==0){
        System.out.println(a+"為偶數");
	}else{
		System.out.println(a+"為奇數");
	}
        
	}

}
