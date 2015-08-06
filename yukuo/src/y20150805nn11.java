package y20150805;
import java.util.Scanner;
public class y20150805nn11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入飲料店名稱");
        String s = scn.next();
        System.out.println("請輸入飲料");
        String d = scn.next();
        System.out.println("請輸入價錢");
        int c = scn.nextInt();
        
        if(s.equals("五十嵐")){
        	System.out.println("不喝");
        }else if(c<=45){
        switch(d){
        case "咖啡":
        	System.out.println("喝");
        	break ;
        case "綠茶":
        	System.out.println("喝");
        	break ;
        }
        	
        }else{
        	System.out.println("不喝");
        	
        }
	}
}
        