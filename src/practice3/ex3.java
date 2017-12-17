package practice3;

public class ex3 {
    public static void main(String[] args) {
        System.out.println("Insert man age:");

        int firstAge = TextIO.getlnInt();

        System.out.println("Insert female age:");

        int secondAge = TextIO.getlnInt();

        int ageDiff = Math.abs(firstAge - secondAge);

        if(5 < ageDiff && ageDiff <= 10)
            System.out.println("Quite okay");
        else if(11 <= ageDiff && ageDiff <= 15)
            System.out.println("Not that okay");
        else if (ageDiff > 15)
            System.out.println("Not okay");
        else
            System.out.println("Very nice");






        }
}
