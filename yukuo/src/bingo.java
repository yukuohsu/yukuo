package y20150819;
import java.util.Scanner;
public class bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = (int)(Math.random()*99+1);
		System.out.println("�C���}�l�A�вq�@�ӼƦr");
		int guess=0;
		while(guess!=a){
			guess = scn.nextInt();
			if(guess>a){
				System.out.println("�Ӥj");
			}else{
				if(guess<a){
					System.out.println("�Ӥp");
				}else{
					if(guess==a){
						System.out.println("bingo!");
					}
				}
				
			}
			
		}
	}

}
