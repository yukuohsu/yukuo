package y20150805;
import java.util.Scanner;
public class y20150805n2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("請輸入傾角度");
        int a = scn.nextInt();
        System.out.println("請輸入兩輪軸心之軸距");
        int o = scn.nextInt();
        System.out.println("請輸入輪胎尺寸");
        int s = scn.nextInt();
        if(a>43 && o>130 && s==12){
           System.out.println("符合");
        }else{
        	System.out.println("不符合");   
        }
	}
}
