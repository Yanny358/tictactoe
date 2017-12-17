package practice6;

import java.util.Arrays;

import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {


        print10Numbers();


    }

    private static void print10Numbers() {



        int[] numbers = new int[4];


        for (int index = 0; index < numbers.length; index++) {

            System.out.println("Please enter a number: ");

            numbers[index] = TextIO.getlnInt();


        }

        for (int index = numbers.length - 1; index >= 0; index--){

            System.out.print(numbers[index] + "|");
        }



        //System.out.println(Arrays.toString(numbers));

        //System.out.println(numbers[new Random().nextInt(numbers.length)]);

    }
}
