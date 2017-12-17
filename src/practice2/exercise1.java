package practice2;

public class exercise1 {

    public static void main(String[] args) {
        System.out.println("Whats your name?");

        String name = TextIO.getlnString();

        System.out.println("Whats your shoe size?");

        int shoeSize = TextIO.getlnInt();

        System.out.println("Your name is " + name + " and your shoe size is " + shoeSize);

    }
}
