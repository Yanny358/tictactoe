package practice2;

public class exercise4 {

    public static void main(String[] args) {
        System.out.println("Whats your name?");

        String name = TextIO.getlnString();


        int nameLength = name.length();

        System.out.println("Your name is " + name + " and your name length is " + nameLength);

    }
}
