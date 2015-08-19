package y20150819;
import java.util.Scanner;
public class bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = (int)(Math.random()*99+1);
		System.out.println("遊戲開始，請猜一個數字");
		int guess=0;
		while(guess!=a){
			guess = scn.nextInt();
			if(guess>a){
				System.out.println("太大");
			}else{
				if(guess<a){
					System.out.println("太小");
				}else{
					if(guess==a){
						System.out.println("bingo!");
					}
				}
				
			}
			
		}
	}

}
