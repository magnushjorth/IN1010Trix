import easyIO.*;

class Differanse {
  public static void main(String[] args) {

    In tast = new In();
    Out skjerm = new Out();

    skjerm.out("Oppgi verdien til x: ");
    int x = tast.inInt();

    skjerm.out("Oppgi verdien til y: ");
    int y = tast.inInt();

    int dif;
    dif = x - y;

    skjerm.out("Differansen mellom x og y er " + dif + ".");
  }
}
