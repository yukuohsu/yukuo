package y20150806;
import java.util.Scanner;
public class y20150806n1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入星期");
		int m = scn.nextInt();
	    switch(m){
	    case 1 :
	    	System.out.println("星期"+m+"的英文是Monday");
	        break;
	    case 2 :
	    	System.out.println("星期"+m+"的英文是Tuesday");
	        break;
	    case 3 :
	    	System.out.println("星期"+m+"的英文是Wednesday");
	    	break;
	    case 4 :
	    	System.out.println("星期"+m+"的英文是Thursday");
	    	break;
	    case 5 :
	    	System.out.println("星期"+m+"的英文是Friday");
	    	break;
	    case 6 :
	    	System.out.println("星期"+m+"的英文是Saturday");
	    	break;
	    case 7 :
	    	System.out.println("星期"+m+"的英文是Sunday");
	    	break;
	    default :
	    	System.out.println("沒有這個星期哦");
	    }
		}

	}
