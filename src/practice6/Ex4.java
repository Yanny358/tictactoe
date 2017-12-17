package practice6;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {


        showNumberOfLetterAinName();


    }

    private static void showNumberOfLetterAinName() {

        ArrayList<String> names = new ArrayList<>();

        while (true) {

            System.out.println("Enter a name, press enter to exit");

            String input = TextIO.getlnString();

            if(input.equals(""))
                break;
            else
                names.add(input);

        }

        System.out.println(names);

        for (String name: names
                ) {
            int letterCount = 0;

            for(int index = 0; index < name.length(); index++){

                if(name.charAt(index) == 'a' | name.charAt(index) == 'A' )
                    letterCount++;
            }

            System.out.println(letterCount + " " + name);
        }


    }
}
