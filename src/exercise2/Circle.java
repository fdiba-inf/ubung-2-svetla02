package exercise2;

import java.util.Scanner;
public class Circle {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        
        double r = input.nextDouble();
        double Pi = Math.Pi;
        double C=2*Pi*r;
        double A=Pi*(r*r);
        System.out.println("Circumference: " + C);
        System.out.println("Area: " + A);



    
    }

}
