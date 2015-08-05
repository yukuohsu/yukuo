package y20150805;
import java.util.Scanner;
public class y20150805n6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入身高");
        float c = scn.nextFloat();
        System.out.println("請輸入體重");
        float k = scn.nextFloat();
        double h;
        double w;
        h = c/2.54;
        w = k/0.454;
        System.out.println("您的身高為"+h+"英吋，您的體重為"+w+"磅。");
	}

}
