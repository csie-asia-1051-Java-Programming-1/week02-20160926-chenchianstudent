package hw;
import java.util.Scanner;
public class hw01_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//假設銅板有1元、5元、50元共三種，媽媽請小明去菜市場買水果，給了小明N元，且媽媽交待，要老闆找小明的零錢的數目要最少，
		//而小明到了水果攤買了a1顆蘋果，a2顆柳丁，及a3顆桃子，1顆蘋果15元，1顆柳丁20元，1顆桃子30元，請問老問需找多少個1元、5元、50元，其銅
		//板數目最少。(先輸入媽媽給小明多少錢，N，接著輸入a1, a2, a3 ， 在此n, a1, a2, a3為整數，且a1*15+ a2*20+ a3*30小於或等於N。
		//列出共找小明多少個1元，5元及50元，若帶的錢不夠買水果，則顯示”0”)
Scanner scn=new Scanner(System.in);
System.out.print("小明有幾個1塊");
int m1=scn.nextInt();
System.out.print("小明有幾個5塊");
int m5=scn.nextInt();
System.out.print("小明有幾個50塊");
int m50=scn.nextInt();
System.out.print("蘋果買了");
int a1=scn.nextInt();
System.out.print("柳丁買了");
int a2=scn.nextInt();
System.out.print("桃子買了");
int a3=scn.nextInt();

int price=a1*15+ a2*20+ a3*30;
int allmoney=m1*1+m5*5+m50*50;
if(price>=allmoney){System.out.print("不符合");}
int findmoney=allmoney-price;
System.out.println("找的50元有"+findmoney/50);
System.out.println("找的5元有"+(findmoney-(findmoney/50)*50)/5);
System.out.println("找的1元有"+findmoney%5);

	}

}
