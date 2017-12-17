package practice4;

public class Ex5 {
    public static void main(String[] args) {

        int input = 8;

        int lineStart = 0;

        while (lineStart <= input + 2) {
            System.out.print("- ");

            lineStart++;
        }

        System.out.println();

        for (int row = 0; row <= input; row++) {

            System.out.print("| ");

            for (int column = 0; column <= input; column++) {



                if (row == column || row + column == input)
                    System.out.print("x ");
                else
                    System.out.print(0 + " ");

            }

            System.out.println("| ");

        }

        lineStart = 0;

        while (lineStart <= input + 2) {
            System.out.print("- ");

            lineStart++;

        }
    }
}
