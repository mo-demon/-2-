package ��3����ҵ;

import java.util.Scanner;

public class Perimeteroftriangle {
		    public static void main(String[] args){
		     
		        System.out.print("���������������߳���");
		         
		        @SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
		        float a = input.nextFloat();
		        float b = input.nextFloat();
		        float c = input.nextFloat();
		        if(a + b > c && b + c > a && a + c >b)
		            System.out.println("�ܳ�Ϊ��" + (a + b + c));
		        else
		            System.out.println("�Ƿ�����");
		    }
	public Perimeteroftriangle() {
		// TODO �Զ����ɵĹ��캯�����
	}

}
