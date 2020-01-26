import java.util.Scanner;

class SkattIRuritania {
  public static void main (String[] args) {
    double x;
    double skatt;
    Scanner tast = new Scanner(System.in);

    System.out.println("Oppgi din nettoinntekt: ");
    x = Double.parseDouble(tast.nextLine());

    if (x > 10000) {
      skatt = x * 0.10;
    } else {
      skatt = (10000 * 0.1) + ((x - 10000) * 0.3);
    }
    System.out.println("Skatt: " + skatt);
  }
}
