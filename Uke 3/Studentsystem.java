import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class StudentSystem {
  public static void main(String[] args) {
    Scanner scanner = null;
    String linje;
    int tall = -1;
    Scanner fil = null;

    try {
      scanner = new Scanner(new File("emnestudent.txt"));
    } catch (FileNotFoundException error) {
      System.out.println("Fant ikke filen");
      System.exit(1);
    }

    while(scanner.hasNextLine()) {
      try {
        scanner.next()
        if (scanner.nextLine().equals("*")) {
        System.out.println("True"); }
      } catch (InputMismatchException error) {
        System.out.println("Noe annet en tall ble funnet");
        System.exit(1);
      }
    }
  }
}
