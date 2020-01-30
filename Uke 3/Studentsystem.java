import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Studentsystem {

  private ArrayList<String> studenter;
  private ArrayList<String> fag;

  private Scanner scanner = null;
  private String test = "";

  public Studentsystem(String filnavn) {
    try {
      Scanner scanner = new Scanner(new File(filnavn));
    } catch (FileNotFoundException error) {
      System.out.println("Fant ikke filen.");
      System.exit(1);
    }

    while (scanner.hasNextLine()) {
      try {
        test = scanner.nextLine();
        if (test.contains("*")) {
          System.out.println("True");
        }
      } catch (Exception error) {}
    }
  }
}
