package y20150806;
import java.util.Scanner;
public class y20150806n2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入身分證字號的英文");
		char id = scn.nextLine().charAt(0);
		switch(id){
		case 'A' :
			System.out.println(id+"是台北市");
			break;
		case 'B' :
			System.out.println(id+"是台中市");
			break;
		case 'C' :
			System.out.println(id+"是基隆市");
			break;
		case 'D' :
			System.out.println(id+"是台南市");
			break;
		case 'E' :
			System.out.println(id+"是高雄市");
			break;
		case 'F' :
			System.out.println(id+"是新北市");
			break;
		case 'G' :
			System.out.println(id+"是宜蘭縣");
			break;
		case 'H' :
			System.out.println(id+"是桃園縣");
			break;
		case 'I' :
			System.out.println(id+"是嘉義市");
			break;
		case 'J' :
			System.out.println(id+"是新竹縣");
			break;
		case 'K' :
			System.out.println(id+"是苗栗縣");
			break;
		case 'L' :
			System.out.println(id+"是台中市");
			break;
		case 'M' :
			System.out.println(id+"是南投縣");
			break;
		case 'N' :
			System.out.println(id+"是彰化縣");
			break;
		case 'O' :
			System.out.println(id+"是新竹市 ");
			break;
		case 'P' :
			System.out.println(id+"是雲林縣");
			break;
		case 'Q' :
			System.out.println(id+"是嘉義市");
			break;
		case 'R' :
			System.out.println(id+"是台南市");
			break;
		case 'S' :
			System.out.println(id+"是高雄市");
			break;
		case 'T' :
			System.out.println(id+"是屏東縣");
			break;
		case 'U' :
			System.out.println(id+"是花蓮縣 ");
			break;
		case 'V' :
			System.out.println(id+"是台東縣");
			break;
		case 'W' :
			System.out.println(id+"是金門縣");
			break;
		case 'X' :
			System.out.println(id+"是金門縣");
			break;
		case 'Y' :
			System.out.println(id+"是陽明山");
			break;
		case 'Z' :
			System.out.println(id+"是馬祖");
			break;
		default :
		    System.out.println("請改成大寫");
		}

	}

}
