import java.util.Scanner;

public class KoLapp {
  int nummer;

  public KoLapp(int n) {
    nummer = n;
  }

  public int hentNummer() {
    return nummer;
  }
}

public class KoSystem {

  public void trekkKoLapp() {
    int teller = 0;

    KoLapp nyLapp = new KoLapp(teller);
    nyLapp.hentNummer();
    koLapper.add(nyLapp);
  }

  public void betjenKunde() {
    //Henter ut, printer ut informasjon og fjerner den forste
    //kolappen i lista. Gir feilmelding dersom ingen kunder staar i ko.
  }

  public int antKunder() {
    //Returnerer antall kunder som er i ko.
  }

  public void printKunderIKo() {
    //Printer alle kunder i ko
  }
}

class KoProgram {
  public static void main (String[] args) {

  }
}
