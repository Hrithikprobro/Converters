package javaCode;

import java.util.Scanner;

public class InrToUsd {
    public static void main(String[ ] args){
    	System.out.println("Hello, Enter rupee to convert to Usd");
        Scanner input = new Scanner(System.in);
        Double rupee = input.nextDouble();
        Inr.toUsd(rupee);
        input.close();
    }
}
 class Inr{
    public static void toUsd(Double inr){
        double dollar = inr/78.10;
        System.out.println("$" + dollar);
    }
}
