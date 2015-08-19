package y20150819;

import java.util.Scanner;

public class lunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String resturant[] = { "嗶嗶飯", "牛肉麵", "禾家", "火鍋", "狸之家",
							   "圈圈","麥當勞","全家","7-11","涼麵","這一間早餐",
							   "來來","四海","必勝客" };
		System.out.println("今天吃什麼?");
		int a = (int) (Math.random() * resturant.length);
		System.out.println((a+1)+"."+resturant[a]);
	}

}
