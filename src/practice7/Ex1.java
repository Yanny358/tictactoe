package practice7;

import practice6.TextIO;

import java.util.ArrayList;

public class Ex1 {

    public static void main(String[] args) {

        ArrayList<Human> humansList = new ArrayList<>();

        while (true) {

            System.out.println("Enter a name, press enter to exit");

            String input = TextIO.getlnString();

            if (input.equals(""))
                break;
            else {
                System.out.println("Enter your age");

                int age = TextIO.getlnInt();
                humansList.add(new Human(input, age));
            }


        }

        for (Human person : humansList) {
            person.greet();
        }

    }

}


