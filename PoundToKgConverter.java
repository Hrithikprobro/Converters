package javaCode;
import java.util.Scanner;
public class PoundToKgConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter to Convert pound to Kg ");
		System.out.println(">>>");
        Scanner i = new Scanner(System.in);
        double x = i.nextInt();
        Pound.toKg(x);
        i.close();
	}
  static class Pound{

	public static void toKg(double x) {
		x *= 0.45359237;
		System.out.println(x + " lbs");
		
	}
	  
  } 
}
