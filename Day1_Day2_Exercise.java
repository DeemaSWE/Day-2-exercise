import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //-------Java Basics Exercise-------

        //Exercise 1
        System.out.println("Enter your weight (kg): ");
        double weight = s.nextDouble();

        System.out.println("Enter your height (m): ");
        double height = s.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f ", bmi);

        //Exercise 2
        System.out.println("Enter obtained marks: ");
        double obtainedMarks = s.nextDouble();

        System.out.println("Enter total marks: ");
        double totalMarks = s.nextDouble();

        double percentage = (obtainedMarks / totalMarks) * 100;
        System.out.println("Percentage: " + percentage + "%");

        //Exercise 3
        System.out.println("Enter amount in USD: ");
        double amountInUSD = s.nextDouble();

        System.out.println("Enter exchange rate (USD to EUR): ");
        double exchangeRate = s.nextDouble();

        double amountInEUR = amountInUSD * exchangeRate;

        System.out.println("Amount in EUR: " + amountInEUR);

        //Exercise 4
        System.out.println("Enter a string: ");
        String str = s.nextLine();

        int length = str.length();
        StringBuilder reversed = new StringBuilder(str).reverse();

        System.out.println("Length of the string: " + length + " And Reversed string:" + reversed);

        //Exercise 5
        System.out.println("Enter a sentence: ");
        String sentence = s.nextLine();

        System.out.println("Enter the start index: ");
        int startIndex = s.nextInt();

        System.out.println("Enter the end index: ");
        int endIndex = s.nextInt();

        String substring = sentence.substring(startIndex, endIndex);

        System.out.println("Extracted substring: " + substring);

        //Exercise 6
        System.out.println("Enter a sentence: ");
        String sentence2 = s.nextLine();

        System.out.println("Enter a keyword: ");
        String keyword = s.nextLine();

        if(sentence2.contains(keyword)){
            System.out.println("Keyword \"" + keyword + "\" is present in the sentence");
        } else {
            System.out.println("Keyword not found");
        }

        //Exercise 7
        System.out.println("Enter a sentence: ");
        String sentence3 = s.nextLine();

        System.out.println("Enter the word to replace: ");
        String wordToReplace = s.nextLine();

        System.out.println("Enter the replacement word: ");
        String replacementWord = s.nextLine();

        String finalSentence = sentence3.replace(wordToReplace, replacementWord);

        System.out.println(finalSentence);

        //Exercise 8
        System.out.println("Enter string 1: ");
        String string1 = s.nextLine();

        System.out.println("Enter string 2: ");
        String string2 = s.nextLine();

        if (string1.equalsIgnoreCase(string2)) {
            System.out.println("Strings are equal (ignoring case)");
        } else {
            System.out.println("Strings are not equal (ignoring case)");
        }

        //-------Conditional Exercise-------

        //Exercise 1
        System.out.println("Enter the user role: ");
        String role = s.nextLine();

        if(role.equals("admin")) {
            System.out.println("Welcome admin");
        } else if(role.equals("superuser")) {
            System.out.println("Welcome superuser");
        } else if(role.equals("user")) {
            System.out.println("Welcome user");
        } else {
            System.out.println("Unknown");
        }

        //Exercise 2
        System.out.println("Input the 1st number: ");
        int num1 = s.nextInt();

        System.out.println("Input the 2nd number: ");
        int num2 = s.nextInt();

        System.out.println("Input the 3rd number: ");
        int num3 = s.nextInt();

        int greatestNumber;

        if (num1 >= num2 && num1 >= num3) {
            greatestNumber = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatestNumber = num2;
        } else {
            greatestNumber = num3;
        }

        System.out.println("The greatest number: " + greatestNumber);

        //Exercise 3
        Random random = new Random();
        int randomNumber = random.nextInt(7) + 1;

        String weekdayName;

        switch(randomNumber) {
            case 1:
                weekdayName = "Sunday";
                break;
            case 2:
                weekdayName = "Monday";
                break;
            case 3:
                weekdayName = "Tuesday";
                break;
            case 4:
                weekdayName = "Wednesday";
                break;
            case 5:
                weekdayName = "Thursday";
                break;
            case 6:
                weekdayName = "Friday";
                break;
            case 7:
                weekdayName = "Saturday";
                break;
            default:
                weekdayName = "Invalid weekday";
                break;
        }

        System.out.println("Number: " + randomNumber);
        System.out.println("Weekday: " + weekdayName);

        //Exercise 4
        System.out.println("Enter the numeric score: ");
        int score = s.nextInt();

        String grade;

        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score <= 89) {
            grade = "B";
        } else if (score >= 70 && score <= 79) {
            grade = "C";
        } else if (score >= 60 && score <= 69) {
            grade = "D";
        } else if (score >= 0 && score <= 59) {
            grade = "F";
        } else {
            grade = "Invalid score";
        }

        System.out.println("Numeric Score: " + score);
        System.out.println("Letter grade: " + grade);

        //Exercise 5
        System.out.println("Enter your age: ");
        int age = s.nextInt();

        String category;

        if (age < 13) {
            category = "Child";
        } else if (age >= 13 && age <= 19) {
            category = "Teenager";
        } else {
            category = "Adult";
        }

        System.out.println("You are a " + category);

        s.close();

    }
}
