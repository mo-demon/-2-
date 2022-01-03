package 第3次作业;

import java.util.Scanner;

public class WhetherThePointIsInsideTheRectangle {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double pointX,pointY;

        System.out.print("Enter a point with two coordinates:");
        Scanner input = new Scanner(System.in);
        pointX = input.nextDouble();
        pointY = input.nextDouble();

        // Check if the point is in the rectangle
        if((pointX >= -5 && pointX <= 5) && (pointY >= -2.5 && pointY <= 2.5))
            System.out.println("Point " + "(" + pointX + "," + pointY + ")"
                    + " is in the rectangle");
        else
            System.out.println("Point " + "(" + pointX + "," + pointY + ")"
                    + " is not in the rectangle");

        input.close();
	}
}