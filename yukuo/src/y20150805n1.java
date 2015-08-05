package y20150805;
import java.util.Scanner;
public class y20150805n1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
	    System.out.println("請輸入月份");
        int m = scn.nextInt();
        System.out.println("請輸入日期");
        int d = scn.nextInt();
        if(m==1 && d>=20 || m==2 && d<=18){
        System.out.println("水瓶座:個性有冒險精神");
        }else{
        if(m==2 && d>=19 || m==3 && d<=20){
        System.out.println("雙魚座:個性忠厚老實");
        }else{
        if(m==3 && d<=21 || m==4 && d<=19){
        System.out.println("白羊座:個性堅強");
        }else{
        if(m==4 && d>=20 || m==5 && d<=20){
        System.out.println("金牛座:個性隱定.慎重");
        }else{
        if(m==5 && d>=21 || m==6 && d<=21){
        System.out.println("雙子座:有敏銳的觀察力");
        }else{
        if(m==6 && d>=22 || m==7 && d<=22){
        System.out.println("巨蟹座:感情豐富");
        }else{
        if(m==7 && d>=23 || m==8 && d<=22){
        System.out.println("獅子座:個性可靠.寬大");
        }else{
        if(m==8 && d>=23 || m==9 && d<=22){
        System.out.println("處女座:個性純潔.正義");
        }else{
        if(m==9 && d>=23 || m==10 && d<=22){
        System.out.println("天秤座:個性平凡.快樂");
        }else{
        if(m==10 && d>=23 || m==11 && d<=21){
        System.out.println("天蠍座:個性 有耐力.意志力");
        }else{
        if(m==11 && d>=22 || m==12 && d<=21){
        System.out.println("射手座:個性坦白.值得信任");
        }else{
        if(m==12 && d>=22 || m==1 && d<=19){
        System.out.println("魔羯座:個性腳踏實地");
        }
}
        }
        }
        }
        }
        }
        }
        }
        }
        }
        }
	}}
