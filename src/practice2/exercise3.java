package practice2;

public class exercise3 {

    public static void main(String[] args) {
        System.out.println("Enter first number of people:");

        int firstNumber = TextIO.getlnInt();

        System.out.println("Enter second number of groups:");

        int secondNumber = TextIO.getlnInt();

        int fullGroups = firstNumber / secondNumber;

        int leftover = firstNumber % secondNumber;

        System.out.format("You'll get %d groups and %d are left", fullGroups, leftover);

    }
}
