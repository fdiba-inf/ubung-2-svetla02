package exercise2;

import java.util.Scanner;

public class  SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        //456
        
        int number1 = number % 10; // 6
        int number2 = ((number / 10) % 10); // 5
        int number3 = ((number / 10) / 10); // 4
        
        int SumOfDigits = number1 + number2 + number3;

        System.out.println("Sum Of digits: " + SumOfDigits);
  
        
    }

}
