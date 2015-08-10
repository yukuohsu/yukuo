package y20150810;
import java.util.Scanner;
public class y20150810n3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int w = 0;
		int t = 0;
		while(w<600){
			System.out.println("請輸入這棵樹採下來的龍眼重量(公斤)");
			int a = scn.nextInt();
			w=w+a;
			t++;
		}
		System.out.println("總共採了"+t+"棵龍眼樹而集滿30箱，總重量為"+w+"公斤");

	}

}
