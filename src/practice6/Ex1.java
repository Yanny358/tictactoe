package practice6;

import java.util.Arrays;

import java.util.Random;

public class Ex1 {

    public static void main(String[] args) {


        print10Names();


    }

    private static void print10Names() {

        System.out.println("Enter array size: ");

        String[] names = new String[TextIO.getlnInt()];


        for (int index = 0; index < names.length; index++) {

            System.out.println("Please enter a name: ");

            names[index] = TextIO.getlnString();


        }

        System.out.println(Arrays.toString(names));

        System.out.println(names[new Random().nextInt(names.length)]);

    }
}
