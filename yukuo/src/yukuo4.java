package y20150804;
import java.util.Scanner;
public class yukuo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("�п�JA��");
        int a = scn.nextInt();
        System.out.println("�п�JB��");
        int b = scn.nextInt();
        System.out.println("�п�J+.-.*./");
        String c = scn.next();
        if(c.equals("+")){
        System.out.println("�ۥ[��"+(a+b));
        }else{
        if(c.equals("-")){
        System.out.println("�۴"+(a-b));
        }else{
        if(c.equals("*")){
        System.out.println("�ۭ���"+(a*b));
        }else{
        System.out.println("�۰���"+(a/b));
        }
        }
        }
        
	}

}
