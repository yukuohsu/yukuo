package y20150805;
import java.util.Scanner;
public class y20150805nn11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("�п�J���Ʃ��W��");
        String s = scn.next();
        System.out.println("�п�J����");
        String d = scn.next();
        System.out.println("�п�J����");
        int c = scn.nextInt();
        
        if(s.equals("���Q�P")){
        	System.out.println("����");
        }else if(c<=45){
        switch(d){
        case "�@��":
        	System.out.println("��");
        	break ;
        case "���":
        	System.out.println("��");
        	break ;
        }
        	
        }else{
        	System.out.println("����");
        	
        }
	}
}
        