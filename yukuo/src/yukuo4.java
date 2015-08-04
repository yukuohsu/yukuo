package y20150804;
import java.util.Scanner;
public class yukuo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("請輸入A值");
        int a = scn.nextInt();
        System.out.println("請輸入B值");
        int b = scn.nextInt();
        System.out.println("請輸入+.-.*./");
        String c = scn.next();
        if(c.equals("+")){
        System.out.println("相加為"+(a+b));
        }else{
        if(c.equals("-")){
        System.out.println("相減為"+(a-b));
        }else{
        if(c.equals("*")){
        System.out.println("相乘為"+(a*b));
        }else{
        System.out.println("相除為"+(a/b));
        }
        }
        }
        
	}

}
