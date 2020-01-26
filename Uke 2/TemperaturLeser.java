import java.util.Scanner;
import java.io.File;

class TemperaturLeser {

  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(new File("Temperatur.txt"));
    int[] array = new int[12];
    int teller = 0;


    while(scanner.hasNextLine()) {
      String linje = scanner.nextLine();
      array[teller] = Integer.parseInt(linje);
      teller++;
    }

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]+"°");
    }
  }
}
