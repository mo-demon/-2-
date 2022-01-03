package 第3次作业;

import java.util.Random;

public class PickCard {
	public static void main(String[] args){
        Random r1 = new Random();
        Random r2 = new Random();
        int size = r1.nextInt(13);
        int color = r2.nextInt(4);
        switch (size){
            case 0:System.out.print("The card you picked is 1 of ");break;
            case 1:System.out.print("The card you picked is 2 of ");break;
            case 2:System.out.print("The card you picked is 3 of ");break;
            case 3:System.out.print("The card you picked is 4 of ");break;
            case 4:System.out.print("The card you picked is 5 of ");break;
            case 5:System.out.print("The card you picked is 6 of ");break;
            case 6:System.out.print("The card you picked is 7 of ");break;
            case 7:System.out.print("The card you picked is 8 of ");break;
            case 8:System.out.print("The card you picked is 9 of ");break;
            case 9:System.out.print("The card you picked is 10 of ");break;
            case 10:System.out.print("The card you picked is Jack of ");break;
            case 11:System.out.print("The card you picked is Queen of ");break;
            case 12:System.out.print("The card you picked is King of ");break;
        }
        switch (color){
            case 0:System.out.print("Clubs");break;
            case 1:System.out.print("Diamonds");break;
            case 2:System.out.print("Hearts");break;
            case 3:System.out.print("Spades");break;
        }
	}
}
