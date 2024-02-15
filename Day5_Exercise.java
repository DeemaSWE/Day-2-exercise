import java.util.ArrayList;
import java.util.Arrays;

public class Day5_Exercise {

    public static void main(String[] args){

        //Exercise 1
        int[] numbers = {50, -20, 0, 30, 40, 60, 10};
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];

        if(firstElement == lastElement){
            System.out.println("True");
        } else {
            System.out.println("False");
        }


        //Exercise 2
        int[] numbers2 = {1, 4, 17, 7, 25, 3, 100};

        int total = 0;
        for (int n : numbers2){
            total += n;
        }
        float average =  total / numbers2.length;

        StringBuilder str = new StringBuilder("The average of the said array is: " + average +
                "\nThe numbers in the said array that are greater than the average are:");

        for (int n : numbers2){
            if(n > average){
                str.append(" ").append(n);
            }
        }
        System.out.println(str);


        //Exercise 3
        int[] numbers3 = {20, 30, 40};
        int first = numbers3[0];
        int last = numbers3[numbers3.length - 1];

        if(first == last){
            System.out.println("The first and last elements are equal");
        }else {
            System.out.println("Larger value between first and last element: " + Math.max(first, last));
        }


        //Exercise 4
        int[] firstArray = {20, 30, 40};
        int[] newArray = Arrays.copyOf(firstArray, firstArray.length);

        int firstEL = firstArray[0];
        int lastEL = firstArray[firstArray.length - 1];

        newArray[0] = lastEL;
        newArray[newArray.length - 1] = firstEL;
        System.out.println("New array after swapping the first and last elements: " + Arrays.toString(newArray));


        //Exercise 5
        int[] array = {2,3,40,1,5,9,4,10,7};
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int a : array) {
            if (a % 2 != 0) {
                odd.add(a);
            } else {
                even.add(a);
            }
        }

        odd.addAll(even);
        System.out.println("Output: " + odd);


        //Exercise 6
        int[] array1 = {2,3,6,6,4};
        int[] array2 = {2,3,6,6,4};
        boolean isEqual = true;

        if(array1.length != array2.length){
            isEqual = false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if(array1[i] != array2[i]){
                    isEqual = false;
                    break;
                }
            }
        }

        if(isEqual){
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are Not equal");
        }

    }
}
