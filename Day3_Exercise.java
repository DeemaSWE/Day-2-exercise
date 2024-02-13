package Exercise_3;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {

        //Loops Exercise

        Scanner s = new Scanner(System.in);

        //Exercise 1
        for(int i=1; i<=100; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        //Exercise 2
        System.out.println("Please enter a string: ");
        String str = s.nextLine();
        String newStr = "";

        for(int i = str.length() - 1; i >= 0; i--){
            newStr += str.charAt(i);
        }
        System.out.println("Reversed String: " + newStr);

        //Exercise 3
        System.out.println("Please enter a number to find the factorial:");
        int num = s.nextInt();
        int factorial = 1;

        for(int i = num; i > 1; i--){
            factorial *= i;
        }
        System.out.println("The factorial: " + factorial);

        //Exercise 4
        System.out.print("Please enter the base number: ");
        int base = s.nextInt();

        System.out.print("Please enter the exponent: ");
        int exponent = s.nextInt();

        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println("The result: " + result);

        //Exercise 5
        int number = 0;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.println("Please enter an integer or -1 to quit");
            number = s.nextInt();

            if(number % 2 == 0){
                evenSum += number;
            } else if (number % 2 == 1){
                oddSum += number;
            }

        }while(number != -1);
        System.out.println("The sum of even integers: " + evenSum);
        System.out.println("The sum of odd integers: " + oddSum);

        //Exercise 6
        System.out.print("Please enter a positive integer: ");
        int integer = s.nextInt();

        while(integer <= 1) {
            System.out.print("Please enter a number greater than 1: ");
            integer = s.nextInt();
        }

        boolean isPrime = true;
        for (int i = 2; i <= integer / 2; ++i) {
            if (integer % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(integer + " is a prime number");
        } else {
            System.out.println(integer + " is not a prime number");
        }

        //Exercise 7
        for(int i = 1; i <= 4; i++){
            System.out.println("Week " + i);
            for(int j = 1; j <= 7; j++){
                System.out.println("Day" + j);
            }
        }

        //Exercise 8
        System.out.print("Please enter a word: ");
        String word = s.nextLine();
        String reverseWord = "";

        for (int i = word.length()-1; i >=0; i--) {
            reverseWord += word.charAt(i);
        }

        if(word.toLowerCase().equals(reverseWord.toLowerCase())){
            System.out.println(word + " is a Palindrome word");
        } else {
            System.out.println(word + " is not a Palindrome word");
        }
    }
}
