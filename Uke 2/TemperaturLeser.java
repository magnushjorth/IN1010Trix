import java.util.Scanner;
import java.io.File;

class TemperaturLeser {
  public static void main(String[] args) throws Exception {
    String[] temp = new String[12];
    Scanner fil = new Scanner(new File("Temperatur.txt"));

    int teller = 0;

    while (fil.hasNextLine()) {
      temp[teller] = fil.nextLine();
      teller++;
    }

    for (int i = 0; i < temp.length; i++) {
      System.out.println(temp[i]);
    }
  }
}
