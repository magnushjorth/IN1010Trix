import easyIO.*;

class Produkt {
  public static void main (String[] args) {
    In tast = new In();
    Out skjerm = new Out();

    skjerm.out("Oppgi verdien til x: ");
    int x = tast.inInt();

    skjerm.out("Oppgi verdien til y: ");
    int y = tast.inInt();

    int produkt;
    produkt = x * y;

    skjerm.out("Produktet av x og y " + produkt + ".");
  }
}
