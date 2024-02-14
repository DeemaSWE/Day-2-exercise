import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        //Exercise 1
        System.out.println("Please enter the first number: ");
        int firstNum = s.nextInt();
        System.out.println("Please enter the second number: ");
        int secondNum = s.nextInt();

        System.out.printf("%d + %d = %d%n", firstNum, secondNum, firstNum + secondNum);
        System.out.printf("%d - %d = %d%n", firstNum, secondNum, firstNum - secondNum);
        System.out.printf("%d x %d = %d%n", firstNum, secondNum, firstNum * secondNum);
        System.out.printf("%d / %d = %d%n", firstNum, secondNum, firstNum / secondNum);
        System.out.printf("%d mod %d = %d%n", firstNum, secondNum, firstNum % secondNum);


        //Exercise 2
        System.out.println("Please enter a number: ");
        int num = s.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", num, i, num * i);
        }


        //Exercise 3
        System.out.println("Please enter the radius: ");
        double radius = s.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);


        //Exercise 4
        System.out.println("Please enter the count of numbers: ");
        int count = s.nextInt();
        double sum = 0;

        for (int i = 1; i <= count; i++) {
            System.out.println("Please enter an integer: ");
            int integer = s.nextInt();
            sum += integer;
        }
        System.out.println("The average is: " + sum / count);


        //Exercise 5
        System.out.println("Please enter the first number: ");
        int num1 = s.nextInt();
        System.out.println("Please enter the second number: ");
        int num2 = s.nextInt();
        System.out.println("Please enter the third number: ");
        int num3 = s.nextInt();

        if(num1 + num2 == num3){
            System.out.println("The result is: true");
        } else{
            System.out.println("The result is: false");
        }


        //Exercise 6
        System.out.println("Please enter a word: ");
        String word = s.nextLine();
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        System.out.println("Reversed word: " + reversedWord);


        //Exercise 7
        System.out.println("Please enter a number: ");
        int number = s.nextInt();

        if(number % 2 == 0){
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }


        //Exercise 8
        System.out.println("Please enter temperature in Centigrade: ");
        double celsius = s.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);


        //Exercise 9
        System.out.println("Please enter a string: ");
        String string = s.nextLine();
        System.out.println("Please enter a index: ");
        int index = s.nextInt();

        if(index >= 0 && index < string.length()){
            System.out.println("The character at index " + index + " is " + string.charAt(index));
        }else{
            System.out.println("Invalid index");
        }


        //Exercise 10
        System.out.println("Please enter the width: ");
        double width = s.nextDouble();
        System.out.println("Please enter the height: ");
        double height = s.nextDouble();

        double areaRectangle = width * height;
        double perimeterRectangle = 2 * (width + height);

        System.out.println("Area is " + width + " * " + height + " = " + areaRectangle);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeterRectangle);


        //Exercise 11
        System.out.println("Please enter the first number: ");
        int number1 = s.nextInt();
        System.out.println("Please enter the second number: ");
        int number2 = s.nextInt();

        if(number1 == number2){
            System.out.printf("%d == %d%n", number1, number2);
        } else {
            System.out.printf("%d != %d%n", number1, number2);
        }

        if(number1 >= number2){
            System.out.printf("%d >= %d%n", number1, number2);
        } else{
            System.out.printf("%d < %d%n", number1, number2);
        }

        if(number1 <= number2){
            System.out.printf("%d <= %d%n", number1, number2);
        } else {
            System.out.printf("%d > %d%n", number1, number2);
        }


        //Exercise 12
        System.out.println("Please enter seconds: ");
        int totalSeconds = s.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);


        //Exercise 13
        System.out.println("Please enter the first integer: ");
        int integer1 = s.nextInt();
        System.out.println("Please enter the second integer: ");
        int integer2 = s.nextInt();
        System.out.println("Please enter the third integer: ");
        int integer3 = s.nextInt();
        System.out.println("Please enter the fourth integer: ");
        int integer4 = s.nextInt();

        if(integer1 == integer2 && integer2 == integer3 && integer3 == integer4){
            System.out.println("Numbers are equal");
        }else {
            System.out.println("Numbers are not equal");
        }


        //Exercise 14
        System.out.println("Please enter an integer: ");
        int integer = s.nextInt();

        if(integer == 0){
            System.out.println("The number is zero");
        } else if (integer > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }


        //Exercise 15
        int n = 0;
        int sumZero = 0;
        int sumPositive = 0;
        int sumNegative = 0;

        do{
            System.out.println("Please enter a number or -1 to quit");
            n = s.nextInt();
            if(n == 0) {
                sumZero++;
            } else if(n > 0){
                sumPositive++;
            } else if(n != -1){
                sumNegative++;
            }
        } while(n != -1);

        System.out.println(sumPositive + " positives");
        System.out.println(sumZero + " zeros");
        System.out.println(sumNegative + " negatives");


        //Exercise 16
        System.out.println("Please enter an integer: ");
        int numbers = s.nextInt();
        String numStr = Integer.toString(numbers);
        String reversedNum = "";

        for (int i = numStr.length() - 1; i >= 0 ; i--) {
            reversedNum += numStr.charAt(i);
        }

        System.out.println("Digits reversed: " + reversedNum);


        //Exercise 17
        String strNum = "";
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        while (true) {
            System.out.println("Please enter a number or enter 'Q' to quit");
            strNum = s.nextLine();

            if (strNum.equals("Q")) {
                break;
            }

            int intNum = Integer.parseInt(strNum);

            if (intNum > largest) {
                largest = intNum;
            }

            if (intNum < smallest) {
                smallest = intNum;
            }
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);


        //Exercise 18
        System.out.println("Please enter a string: ");
        String str = s.nextLine();
        int aCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a'){
                aCount++;
            }
        }

        System.out.println("Number of a's is: " + aCount);

    }
}
