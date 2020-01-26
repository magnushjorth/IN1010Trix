import java.util.Scanner;

class Handletur {
  public static void main (String[] args) {
    int totalpris = 0;

    Scanner tast = new Scanner(System.in);

    System.out.println("Hei! Velkommen til IFI-butikken.");

    System.out.println("Hvor mange brød vil du ha?");
    int b = Integer.parseInt(tast.nextLine()) * 20;
    totalpris += b;

    System.out.println("Hvor mange melk vil du ha?");
    int m = Integer.parseInt(tast.nextLine()) * 15;
    totalpris += m;

    System.out.println("Hvor mange ost vil du?");
    int o = Integer.parseInt(tast.nextLine()) * 40;
    totalpris += o;

    System.out.println("Hvor mange yoghurt vil du?");
    int y = Integer.parseInt(tast.nextLine()) * 12;
    totalpris += y;

    System.out.println("Du skal betale: " + totalpris + " kr.");
  }
}
