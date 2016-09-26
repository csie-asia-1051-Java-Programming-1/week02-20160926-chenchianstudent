package ex;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。
 * 	請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。
 * 	如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)。
 * Date: 2016/09/26
 * Author: 105021007 陳麒安
 */
import java.util.Scanner;
public class ex02_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("x=");
int x=scn.nextInt();
System.out.print("y=");
int y=scn.nextInt();
double c=x-0;
double c1=Math.pow(c,2);
double d=y-0;
double d1=Math.pow(d,2);
double e=c1-d1;
double g=Math.pow(1/2,e);








if(g>=100){System.out.print("yes");}
else{System.out.print("no");}
}




	

}
