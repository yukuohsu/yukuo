package y20150805;
import java.util.Scanner;
public class y20150805nn11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入飲料店名稱");
        String s = scn.next();
        System.out.println("請輸入飲料 1=綠茶，2=咖啡");
        int d = scn.nextInt();
        System.out.println("請輸入價錢");
        int c = scn.nextInt();
        
        if(s.equals("五十嵐")){
        	System.out.println("不喝");
        }else{
        	if(d==1 || d==2){
        		System.out.println("喝");
        	}else{
        		if(c<=45){
        			System.out.println("喝");
        		}else{
        			System.out.println("不喝");
        		}
        	}
        }
	}

}
