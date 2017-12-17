package practice5;

public class Ex1 {
    public static void main(String[] args) {

      //  drawTable(11);

       // drawTable(17);

      // System.out.println( xCharacters( 'c', 5));

       // System.out.println( xCharacters( 'e', 10));

        System.out.println(getNumber("Insert a number",5, 10));
        System.out.println(getNumber("Введите номер",5, 10));
    }

    public static int getNumber(String message, int min, int max) {

        while (true) {

            System.out.println(message);

            int number = TextIO.getlnInt();

            if (number < min)
                System.out.println("Sorry your number was less than min");
            else if (number > max)
                System.out.println("Sorry your number was more than max");
            else
                return number;

            return number;
        }

    }


    private static String xCharacters(char inputCharacter, int timesRepeated) {
        String result = "";
        for(int start =0; start < timesRepeated; start++){
            result += inputCharacter;
        }

        return result;

    }

    public static void drawTable(int tableSize) {

        drawLine(tableSize);


        System.out.println();

        for (int row = 0; row <= tableSize; row++) {

            System.out.print("| ");

            for (int column = 0; column <= tableSize; column++) {



                if (row == column || row + column == tableSize)
                    System.out.print("x ");
                else
                    System.out.print(0 + " ");

            }

            System.out.println("| ");

        }

        drawLine(tableSize);

        System.out.println();
    }

    private static void drawLine(int input) {
        int lineStart = 0;

        while (lineStart <= input + 2) {
            System.out.print("- ");

            lineStart++;
        }
    }
}

