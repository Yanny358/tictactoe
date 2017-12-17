package practice3;

public class ex2 {

    public static void main(String[] args) {
        System.out.println("Insert your average grade:");

        double avgGrade = TextIO.getlnDouble();

        System.out.println("Insert your thesis grade:");

        int thesisGrade = TextIO.getlnInt();

        // 3.3 <= 4.5 - false / && / 4 != 5 - false  && true - Sorry

        // 4.7 <= 4.5 - true / && / 4 != 5 - true && true - Sorry

        // 4.5 <= 4.5 - true / && / 5 != 5 - true && false - Sorry

        // 4.8 <=.. ...                    - false && flase

        if (avgGrade >= 4.5 && thesisGrade == 5){
            System.out.println("Nice, CUM LAUDE!");
        }else {
            System.out.println("Sorry your  grades aren't high enough");


        }




    }


}
