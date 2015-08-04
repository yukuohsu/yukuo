package y20150804;
import java.util.Scanner;
public class yukuo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("請輸入身高");
        int a = scn.nextInt();
        System.out.println("請輸入體重");
        int b = scn.nextInt();
        if(a>165 && b<45){
        System.out.println("符合");
        }else{
        System.out.println("不符合");
        }
	}
	}
