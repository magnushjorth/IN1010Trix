import java.util.Scanner;
import java.io.File;

class FraFil {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(new File("tekst.txt"));

    while (scanner.hasNextLine()) {
      String linje = scanner.nextLine();
      System.out.println(linje);
    }
  }
}
