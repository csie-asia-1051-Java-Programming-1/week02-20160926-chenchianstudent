package hw;
import java.util.Scanner;
public class hw02_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//�w���k�ͼз��魫��(������80 )*0.7�F�k�ͼз��魫��(������70)*0.6�F�ռg�@�ӵ{���i�H�p��k�ͤk�ͪ��з��魫�C(��J��ӼƭȡA�̧ǥN�������ΩʧO�]1�N��k�ʡF2�N��k�ʡ^)
		Scanner scn=new Scanner(System.in);
		System.out.print("�ʧO(�k�ʬO1�A�k�ʬO2)�O");
		float s=scn.nextFloat();
		System.out.print("�����O");
		int h=scn.nextInt();
		if(s==1){System.out.print((h-80)*0.7);}else{System.out.print((h-70)*0.6);}
		
		
		
	}

}
