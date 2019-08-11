package JavaStartIO;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JavaStartIO {

    public static void main(String[] args) throws FileNotFoundException {

        File plik = new File("jarek.txt");

        Scanner in = new Scanner(plik);
        String zdanie = in.nextLine();
        System.out.println(zdanie);

        boolean exists = plik.exists();
        System.out.println("Czy istnieje: " + exists);
        String absolutePath = plik.getAbsolutePath();
        System.out.println("Ten plik istnieje w " + absolutePath);

        PrintWriter zapis = new PrintWriter("jarek.txt");
        zapis.println("nowy zapis do pliku");
        zapis.close();

    }
}
