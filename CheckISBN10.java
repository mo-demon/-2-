package 第3次作业;

import java.util.Scanner;

public class CheckISBN10 {
	public static void main(String[] args) {
		int ISBN,check;
		int d1,d2,d3,d4,d5,d6,d7,d8,d9;
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		Scanner input = new Scanner(System.in);
		ISBN = input.nextInt();
		d1 = ISBN / 100000000;
		d2 = ISBN / 10000000 % 10;
		d3 = ISBN / 1000000 % 10;
		d4 = ISBN / 100000 % 10;
		d5 = ISBN / 10000 % 10;
		d6 = ISBN / 1000 % 10;
		d7 = ISBN / 100 % 10;
		d8 = ISBN / 10 % 10;
		d9 = ISBN % 10;
		
		check = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5
			 	+ d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

	if(check == 10)
		System.out.println("The ISBN-10 number is "+ d1+d2+d3+d4+d5+d6+d7+d8+d9 + "X");
	else
		System.out.println("The ISBN-10 number is "+ d1+d2+d3+d4+d5+d6+d7+d8+d9 + check);
	
	input.close();
	}

	public CheckISBN10() {
		// TODO 自动生成的构造函数存根
	}

}
