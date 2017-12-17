package practice3;


public class ex4 {
    public static void main(String[] args) {
        System.out.println("Insert your password:");

        String pass = TextIO.getlnString();



        if(pass.equals("swordfish"))
            System.out.println("Acces granted");
        else
            System.out.println("Acces denied");



    }


}
