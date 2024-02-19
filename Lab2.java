import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab2 {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        //Exercise 1
        String[] words = {"cat", "dog", "red", "is", "am"};

        int longest = 0;

        for (String w : words) {

            if (w.length() > longest) {
                longest = w.length();
            }
        }

        for (String w : words) {

            if (w.length() == longest) {
                System.out.print(w + " ");
            }
        }


        //Exercise 2
        int[] numbers = {1, 1, 1, 3, 3, 5};
        System.out.println("\nPlease enter a number: ");
        int num = s.nextInt();
        int numCount = 0;

        for (int n : numbers) {

            if (n == num) {
                numCount++;
            }
        }
        System.out.printf("%d occurs %d times %n", num, numCount);


        //Exercise 3
        int[] array = {1, 4, 17, 7, 25, 3, 100};
        Arrays.sort(array);

        System.out.println("Please enter number k: ");
        int k = s.nextInt();

        int lastIndex = array.length - 1;
        System.out.println(k + " largest elements of the said array are: ");

        for (int i = 0; i < k; i++) {
            System.out.print(array[lastIndex--] + " ");
        }


        //Exercise 4
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("Original array: " + Arrays.toString(arr));

        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.print("Reversed array: ");
        for (int a : arr) {
            System.out.print(a + " ");
        }


        //Exercise 5
        int[] numArray = null;
        int choice = 0;

        while (choice != 5) {
            System.out.println("Menu:");
            System.out.println("1. Accept elements of an array ");
            System.out.println("2. Display elements of an array");
            System.out.println("3. Search the element within the array");
            System.out.println("4. Sort the array");
            System.out.println("5. Stop");

            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Please enter the size of the array: ");
                    int size = s.nextInt();
                    numArray = new int[size];
                    addElement(numArray);
                    break;

                case 2:
                    displayArray(numArray);
                    break;

                case 3:
                    if (numArray == null) {
                        System.out.println("Array is empty");
                    } else {
                        System.out.println("Please enter the element to search: ");
                        int element = s.nextInt();
                        int index = searchElement(numArray, element);

                        if (index == -1) {
                            System.out.println("Element " + element + " not found in the array");
                        } else {
                            System.out.println("Element " + element + " is found at index " + index);
                        }
                    }
                    break;

                case 4:
                    if (numArray == null) {
                        System.out.println("Array is empty");
                    } else {
                        sortArray(numArray);
                    }
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }


        //Exercise 6
        System.out.println("Enter the minimum value of the range: ");
        int min = s.nextInt();
        System.out.println("Enter the maximum value of the range: ");
        int max = s.nextInt();
        System.out.println("Enter the number of random numbers to generate: ");
        int count = s.nextInt();

        System.out.println("Random numbers within the specified range:");
        for (int i = 0; i < count; i++) {
            int randomNum = generateNumber(min, max);
            System.out.print(randomNum);
            if (i != count - 1) {
                System.out.print(" - ");
            }
        }


        //Exercise 7
        System.out.println("Please enter the password: ");
        String pass = s.nextLine();

        int totalScore = checkLength(pass) + checkSpecialCharacters(pass) + checkUpperCaseLowerCase(pass);

        if (totalScore >= 8) {
            System.out.println("Password is strong");
        } else if (totalScore >= 5) {
            System.out.println("Password is moderately strong");
        } else {
            System.out.println("Password is weak");
        }


        //Exercise 8
        System.out.println("Please enter the number of Fibonacci terms to generate: ");
        int n = s.nextInt();
        generateFibonacciSequence(n);
    }

    private static void generateFibonacciSequence(int n) {

        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }

    private static int checkUpperCaseLowerCase(String pass) {

        boolean lowerCase = false;
        boolean upperCase = false;

        for (char ch : pass.toCharArray()) {
            if (lowerCase && upperCase) {
                break;
            }
            if (Character.isLowerCase(ch)) {
                lowerCase = true;
            }
            if (Character.isUpperCase(ch)) {
                upperCase = true;
            }
        }

        if (lowerCase && upperCase) {
            return 3;
        } else {
            return 0;
        }

    }

    private static int checkSpecialCharacters(String pass) {

        for (char ch : pass.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                return 3;
            }
        }

        return 0;

    }

    private static int checkLength(String pass) {

        if (pass.length() >= 8) {
            return 3;
        } else if (pass.length() >= 6) {
            return 2;
        } else {
            return 0;
        }
    }

    private static int generateNumber(int min, int max) {

        Random random = new Random();
        return random.nextInt(max - min + 1) + min;

    }


    private static void addElement(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter the element of the array: ");
            array[i] = s.nextInt();
        }
    }

    private static void displayArray(int[] array) {

        if (array == null) {
            System.out.println("Array is empty");
        } else {
            System.out.println(Arrays.toString(array));
        }
    }

    private static int searchElement(int[] array, int element) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }

        return -1;

    }

    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }


}
