package y20150806;
import java.util.Scanner;
public class y20150806n1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�P��");
		int m = scn.nextInt();
	    switch(m){
	    case 1 :
	    	System.out.println("�P��"+m+"���^��OMonday");
	        break;
	    case 2 :
	    	System.out.println("�P��"+m+"���^��OTuesday");
	        break;
	    case 3 :
	    	System.out.println("�P��"+m+"���^��OWednesday");
	    	break;
	    case 4 :
	    	System.out.println("�P��"+m+"���^��OThursday");
	    	break;
	    case 5 :
	    	System.out.println("�P��"+m+"���^��OFriday");
	    	break;
	    case 6 :
	    	System.out.println("�P��"+m+"���^��OSaturday");
	    	break;
	    case 7 :
	    	System.out.println("�P��"+m+"���^��OSunday");
	    	break;
	    default :
	    	System.out.println("�S���o�ӬP���@");
	    }
		}

	}
