import java.util.Scanner;

class MindreStorre {
  public static void main (String[] args) {
    int x;
    Scanner tast = new Scanner(System.in);

    System.out.println("Tast inn et tall:");
    x = Integer.parseInt(tast.nextLine());

    if (x > 20) {
      System.out.println("Tallet er over 20");
    } else if (x < 10) {
      System.out.println("Tallet er under 10");
    } else {
      System.out.println("Tallet er mellom 10 og 20");
    }
  }
}
