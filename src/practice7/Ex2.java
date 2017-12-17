package practice7;

import practice6.TextIO;

import java.util.ArrayList;
import java.util.Comparator;

public class Ex2 {
    public static void main(String[] args) {

        ArrayList<Athlete> athleteList = new ArrayList<>();

        while (true) {

            System.out.println("Enter a name and result");

            String input = TextIO.getlnString();

            if (input.equals(""))
                break;
            else {

                String [] inputArray = input.split(" ");

                double result = Double.parseDouble(inputArray[1]);

                athleteList.add(new Athlete(inputArray[0], result));
            }


        }

        athleteList.sort(new Comparator<Athlete>() {
            @Override
            public int compare(Athlete o1, Athlete o2) {
                return o2.getResult().compareTo(o1.getResult());
            }
        });

        athleteList.get(0).setAge(10);

        athleteList.get(0).greet();

        for (Athlete athlete : athleteList) {
            System.out.println(athlete.getName() + " " + athlete.getResult());

        }

    }

}
