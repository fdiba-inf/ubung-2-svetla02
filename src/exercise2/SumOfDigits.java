package exercise2;

import java.util.Scanner;

public class  SumOfDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();        
        int number1 = number % 10;
        int number2 = ((number/10)%10);
        int number3 = ((number/10)/10);
        int sum = number1 + number2 + number3;
        System.out.println("Sum of digits: " + sum);
  
        
    }

}
