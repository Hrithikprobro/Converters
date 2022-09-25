/**
 * 
 */
package javaCode;
import java.util.Scanner;

/**
 * @author 91988
 *
 */
class Foot {
	
	public static void toCentimeter (double x) {
		x = x*30.48;
		System.out.println(x + ".cm");
		
	}
	public static void toInch (int y) {
		y *= 12;
		System.out.println(y + "\"");
	}
}
public class FootToCentimeterAndInchConverter {

	public static void main(String[] args) {
		System.out.println("Enter number to convert ft to cm" + ">>>");
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		Foot.toCentimeter(x);
		System.out.println("Enter number to convert ft to inch" + ">>>");
		Scanner in1 = new Scanner(System.in);
		int y = in1.nextInt();
		Foot.toInch(y);
        in.close();
        in1.close();
	}

}
