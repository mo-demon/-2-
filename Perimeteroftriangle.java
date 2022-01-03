package 第3次作业;

import java.util.Scanner;

public class Perimeteroftriangle {
		    public static void main(String[] args){
		     
		        System.out.print("请输入三角形三边长：");
		         
		        @SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
		        float a = input.nextFloat();
		        float b = input.nextFloat();
		        float c = input.nextFloat();
		        if(a + b > c && b + c > a && a + c >b)
		            System.out.println("周长为：" + (a + b + c));
		        else
		            System.out.println("非法输入");
		    }
	public Perimeteroftriangle() {
		// TODO 自动生成的构造函数存根
	}

}
