package y20150805;
import java.util.Scanner;
public class y20150805n1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("�п�J�P���X");
        int w = scn.nextInt();
        System.out.println("�п�J���");
        int d = scn.nextInt();
        if(d==7 || d==17 || d==27){
        	System.out.println("���Y��");
        	}else{
        		if(w==2 || w==4 || w==6){
                	System.out.println("�Y��");
        		}else{
        		System.out.println("���Y��");
        	}
        }
	}

}
