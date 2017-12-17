package practice4;

public class Ex4 {
    public static void main(String[] args) {

        System.out.println("Please input the size of the table:");

        int input = TextIO.getlnInt();


        for (int row = 0; row <= input; row++) {

            for ( int column = 0; column <= input; column++) {

                if(row == column)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");

            }

            System.out.println();

        }

    }
}
