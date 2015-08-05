package y20150805;
import java.util.Scanner;
public class y20150805n2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("½Ð¿é¤J¦¨ÁZ");
        int s = scn.nextInt();
        if(s>97){
        	System.out.println("A+");
        }else{
        if(s<=97 && s>=94){
        	System.out.println("A");
        }else{
            if(s<=93 && s>=90){
            	System.out.println("A-");
            	}else{
                   	if(s<=89 && s>=87){
                   		System.out.println("B+");
                   	}else{
                       	if(s<=86 && s>=84){
                       		System.out.println("B");
                       	}else{
                           	if(s<=83 && s>=80){
                           		System.out.println("B-");
                           	}else{
                               	if(s<=79 && s>=77){
                               		System.out.println("C+");
                               	}else{
                                   	if(s<=76 && s>=74){
                                   		System.out.println("C");
                                   	}else{
                                       	if(s<=73 && s>=70){
                                       		System.out.println("C-");
                                       	}else{
                                           	if(s<=69 && s>=67){                                            		System.out.println("D+");
                                           	}else{
                                               	if(s<=66 && s>=64){
                                               		System.out.println("D");
                                               	}else{
                                                   	if(s<=63 && s>=60){
                                                   		System.out.println("D-");
                                                   	}else{
                                                   		System.out.println("E");
                                                   	}
                                               	}
                                           	}
                                       	}
                                   	}
                               	}
                           	}
                       	}
                   	}
            	}
            }
        }
	}
}