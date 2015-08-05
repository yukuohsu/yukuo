package y20150805;
import java.util.Scanner;
public class y20150805n3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入性別 男=1 女=2");
        int n = scn.nextInt();
        System.out.println("請輸入身高");
        int t = scn.nextInt();
        double w;
        if(n==1){
        	w = (t-170)*0.6+62;
        	System.out.println("標準體重為"+w);
        }else{
        	if(n==2){
        		w = (t-158)*0.5+52;
        		System.out.println("標準體重為"+w);
        		
        	}
        }
	}

}
