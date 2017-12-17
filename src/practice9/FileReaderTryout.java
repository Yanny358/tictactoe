package practice9;

import practice2.TextIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderTryout {

    public static void main(String[] args) {
        inputFile("tryout.txt");


    }

    private static void inputFile(String filePath) {

        String line;

        try {
            BufferedReader mReader =  new BufferedReader(new FileReader(new File(filePath)));

            while ((line = mReader.readLine  ()) != null) {

                // TODO add to arrayList for usage later

                System.out.println(line);

            }
        } catch   (Exception e){
            e.printStackTrace();
        }
       // } catch (FileNotFoundException e) {
        //    System.out.println("I had a no file");
       //     e.printStackTrace();
      //  } catch (IOException e) {
             //

   // }
}
}
