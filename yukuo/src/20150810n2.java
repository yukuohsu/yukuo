package y20150810;
import java.util.Scanner;
public class y20150810n2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int w = 390;
		int m = 0;
		while(w<500){
			System.out.println("這個小時儲了多少公噸水?");
			int a = scn.nextInt();
			w=w+a;
			m++;
		}
		System.out.println("亞洲水庫花了"+m+"個月儲存到500萬公噸水，現在水量為"+w+"公噸");
		}
	}