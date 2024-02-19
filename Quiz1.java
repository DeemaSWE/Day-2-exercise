import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //Q1
        System.out.println("Please enter the first number: ");
        int num1 = s.nextInt();
        System.out.println("Please enter the second number: ");
        int num2 = s.nextInt();
        System.out.println("Please enter the third number: ");
        int num3 = s.nextInt();

        int largest = num1;

        if(num2 > num1){
            largest = num2;
        }

        if(num3 > largest){
            largest = num3;
        }

        System.out.println("The largest number is: " + largest);


        //Q2
        System.out.println("Please enter a string: ");
        String str = s.nextLine();
        System.out.println("Please enter an index: ");
        int index = s.nextInt();

        if(index < str.length() && index >= 0) {
            System.out.println("The character in the index " + index + " is: " + str.charAt(index));
        } else {
            System.out.println("The index " + index + " is out of string range");
        }


        //Q3
        int sum = 0;
        int n = 1;

        while(n != 0){

            System.out.println("please enter a number or 0 to quit ");
            n = s.nextInt();
            sum += n;
        }

        System.out.println("The sum is: " + sum);


        //Q4
        int[] array =  {10, -21 , 30, 31, -25};

        for (int a : array) {

            if (a > 0) {
                System.out.println(a + " is a positive number");
            } else {
                System.out.println(a + " is a negative number");
            }
        }


        //Q5
        String[] arr = {"Tuwaiq", "Bootcamp", "Student", "JAVA"};
        int shortestLength = arr[0].length();
        String shortestWord = arr[0];

        for (String a : arr) {

            if(a.length() < shortestLength){
                shortestWord = a;
                shortestLength = a.length();
            }
        }

        System.out.println("The shortest word is: " + shortestWord);

    }
}