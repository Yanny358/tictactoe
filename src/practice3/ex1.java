package practice3;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Insert your number:");

        int number = TextIO.getlnInt();

        if(0 == number % 2 )
            System.out.println("Your number is even");
        else
            System.out.println("Your number is odd");



    }
}
