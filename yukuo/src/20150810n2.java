package y20150810;
import java.util.Scanner;
public class y20150810n2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int w = 1;
		float m = 20000;
		while(m<1100000){
		m =(float)((int)m+m*1.002);
			w++;
		}
		System.out.println((w+3)+"點，儲水量到達500萬公噸水");
		}
	}