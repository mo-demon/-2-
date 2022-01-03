package 第3次作业;

import java.util.*;
public class Gamlottery {
		public static void main(String[] args) {
			int guess,guess1,guess2,guess3;
			final int lottery1, lottery2, lottery3;
			final int lottery = (int)(Math.random() * 1000);
			
			System.out.print("Enter your lottery pick (three digits): ");
			Scanner input = new Scanner(System.in);
			guess = input.nextInt();
			
			// Get digits from guess
			guess1 = guess / 100;
			guess2 = guess % 100 / 10;
			guess3 = guess % 10;
			
			// Get digits from lottery
			lottery1 = lottery / 100;
			lottery2 = lottery % 100 / 10;
			lottery3 = lottery % 10;
			
			// Check the guess
			if(lottery == guess)
				System.out.println("Exact match:you win $10000");		
			else if((lottery1 == guess1 && lottery2 == guess3 && lottery3 == guess2)
				||(lottery1 == guess2 && lottery2 == guess1 && lottery3 == guess3)
				||(lottery1 == guess2 && lottery2 == guess3 && lottery3 == guess1)
				||(lottery1 == guess3 && lottery2 == guess1 && lottery3 == guess2)
				||(lottery1 == guess3 && lottery2 == guess2 && lottery3 == guess1))
			{
				System.out.println("Match all digits:you win $3000");
			}
			else if(lottery1 == guess1 || lottery1 == guess2 || lottery1 == guess3
				||lottery2 == guess1 || lottery2 == guess2 || lottery2 == guess3
				||lottery3 == guess1 || lottery3 == guess2 || lottery3 == guess3)
			{
				System.out.println("Match one digit:you win $1000");
			}
			else
			{
				System.out.println("Sorry,no match");
			}
			input.close();
			
		}
		// TODO 自动生成的构造函数存根
	}

