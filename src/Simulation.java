import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {


    ArrayList loadItems = new ArrayList();

    File file = new File("u1.txt");
    Scanner scanner = new Scanner(file);


    public Simulation() throws FileNotFoundException {
    }
}
