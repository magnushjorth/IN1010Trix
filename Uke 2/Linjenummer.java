import java.util.Scanner;
import java.io.File;

class Linjenummer {
  public static void main(String[] args) throws Exception{
    int teller = 0;

    Scanner scanner = new Scanner(new File("tekst.txt"));

    while (scanner.hasNextLine()) {
      teller++;
      System.out.println("# " + teller + ": " + scanner.nextLine());
    }
  }
}
