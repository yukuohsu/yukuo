package y20150805;
import java.util.Scanner;
public class y20150805n2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("�п�J�ɨ���");
        int a = scn.nextInt();
        System.out.println("�п�J����b�ߤ��b�Z");
        int o = scn.nextInt();
        System.out.println("�п�J���L�ؤo");
        int s = scn.nextInt();
        if(a>43 && o>130 && s==12){
           System.out.println("�ŦX");
        }else{
        	System.out.println("���ŦX");   
        }
	}
}
