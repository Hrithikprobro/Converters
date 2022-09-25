package javaCode;

import java.util.Scanner;
/* The Scanner class is used for input */

public class CelsuistoFarienheightandKelvinConverter {
	public static void main(String[] args) {
		System.out.println("Hello enter Celsuis to convert it into Kelvin ");
		System.out.println(">>>>>");
		Scanner x;
		x = new Scanner(System.in);
		double y = x.nextInt();
		y = Celsuis.toKelvin(y);
		System.out.println(y);
		System.out.println("Hello enter Celsuis to convert it into Farienheight ");
		System.out.println(">>>>>");
		Scanner z = new Scanner(System.in);
		double d = z.nextDouble();
		d = Celsuis.toFarienheight(d);
		System.out.println(d);
		z.close();
		x.close();
		int i;
		for (i = 0; i > 10; i++) {
			System.out.println("In a loop" + i);
		}
	}
static class Celsuis{
	// Celsuis class for better understanding and static for using thiss class
	public static  double toKelvin(double x) {
		x += 274.15;
		return x;
		// The method to Convert it into kelvin
	}

	public static double toFarienheight(double x) {
		x = (1.8) * x + 32;
		return x;
		// The method to convert it into farenhieght
	}
}
}