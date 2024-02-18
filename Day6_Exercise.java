import java.util.Scanner;

public class Day6_Exercise {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //Exercise 1
        System.out.println("Please enter the first number: ");
        int n1 = s.nextInt();
        System.out.println("Please enter the second number: ");
        int n2 = s.nextInt();
        System.out.println("Please enter the third number: ");
        int n3 = s.nextInt();
        System.out.println("The smallest values is: " + smallest(n1, n2, n3));

        //Exercise 2
        System.out.println("Please enter a number: ");
        int num = s.nextInt();
        check(num);

        //Exercise 3
        System.out.println("1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits\n" +
                "Input a password (You are agreeing to the above Terms and Conditions.): ");
        String pass = s.nextLine();
        isValid(pass);

    }

    public static int smallest(int n1, int n2, int n3){

        int smallest = n1;

        if(n2 < n1) {
            smallest = n2;
        }

        if(n3 < smallest){
            smallest = n3;
        }

        return smallest;
    }

    public static void check(int num){

        if (num > 0){
            System.out.println("The number is positive");
        } else if (num < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }

    public static void isValid(String pass){

        boolean isValid = true;
        int countDigit = 0;
        int countLetter = 0;
        boolean haveSymbol = false;
        char[] charArray = pass.toCharArray();

        //check if password have at least eight characters
        if(charArray.length < 8){
            isValid = false;
            System.out.println("A password must have at least eight characters.");
        }

        for (char ch : charArray) {

            if (Character.isDigit(ch)) {
                countDigit++;
            }

            if(Character.isLetter(ch)) {
                countLetter++;
            }

            if(!Character.isLetterOrDigit(ch)){
                haveSymbol = true;
            }
        }

        //check if password have symbols
        if(haveSymbol) {
            isValid = false;
            System.out.println("A password must consists of only letters and digits.");
        }

        //check if password contains at least two digits
        if(countDigit < 2){
            isValid = false;
            System.out.println("A password must contain at least two digits.");
        }

        //check if password contains at least one letter
        if(countLetter < 1){
            isValid = false;
            System.out.println("A password must contain at least one letter.");
        }

        if(isValid) {
            System.out.println("Password is valid: " + pass);
        } else{
            System.out.println("Password is Invalid: " + pass);
        }

    }
}
