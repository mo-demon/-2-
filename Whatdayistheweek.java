package 第3次作业;

import java.util.Scanner;

public class Whatdayistheweek {
	public static void main(String[] args)
	{
		int year, month, day, h, q, m, j, k;
		
		System.out.print("Enter year: (e.g.,2012):");
		Scanner input = new Scanner(System.in);
		year = input.nextInt();
		
		System.out.print("Enter month: 1-12:");
		month = input.nextInt();
		
		System.out.print("Enter the day of the month: 1-31:");
		day = input.nextInt();
		
		q = day;
		if(month == 1 || month == 2)
		{
			month += 12;
			year -= 1;
		}
		m = month;
		j = year / 100;
		k = year % 100;
		
		h = (q + (26 * (m + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
		
		switch(h)
		{
			case 0:
				System.out.println("Day of the week is Saturday");
				break;
			case 1:
				System.out.println("Day of the week is Sunday");
				break;
			case 2:
				System.out.println("Day of the week is Monday");
				break;
			case 3:
				System.out.println("Day of the week is Tuesday");
				break;
			case 4:
				System.out.println("Day of the week is Wednesday");
				break;
			case 5:
				System.out.println("Day of the week is Thursday");
				break;
			case 6:
				System.out.println("Day of the week is Friday");
				break;
		}
		
		input.close();
	}
		// TODO 自动生成的构造函数存根
	}
