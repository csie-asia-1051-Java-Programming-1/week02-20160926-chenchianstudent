package hw;
import java.util.Scanner;
public class hw01_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���]�ɪO��1���B5���B50���@�T�ءA�����Фp���h�楫���R���G�A���F�p��N���A�B������ݡA�n�����p�����s�����ƥحn�̤֡A
		//�Ӥp����F���G�u�R�Fa1��ī�G�Aa2���h�B�A��a3����l�A1��ī�G15���A1���h�B20���A1����l30���A�аݦѰݻݧ�h�֭�1���B5���B50���A���
		//�O�ƥس̤֡C(����J�������p���h�ֿ��AN�A���ۿ�Ja1, a2, a3 �A �b��n, a1, a2, a3����ơA�Ba1*15+ a2*20+ a3*30�p��ε���N�C
		//�C�X�@��p���h�֭�1���A5����50���A�Y�a���������R���G�A�h��ܡ�0��)
Scanner scn=new Scanner(System.in);
System.out.print("�p�����X��1��");
int m1=scn.nextInt();
System.out.print("�p�����X��5��");
int m5=scn.nextInt();
System.out.print("�p�����X��50��");
int m50=scn.nextInt();
System.out.print("ī�G�R�F");
int a1=scn.nextInt();
System.out.print("�h�B�R�F");
int a2=scn.nextInt();
System.out.print("��l�R�F");
int a3=scn.nextInt();

int price=a1*15+ a2*20+ a3*30;
int allmoney=m1*1+m5*5+m50*50;
if(price>=allmoney){System.out.print("���ŦX");}
int findmoney=allmoney-price;
System.out.println("�䪺50����"+findmoney/50);
System.out.println("�䪺5����"+(findmoney-(findmoney/50)*50)/5);
System.out.println("�䪺1����"+findmoney%5);

	}

}
