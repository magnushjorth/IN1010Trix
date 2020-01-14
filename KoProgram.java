import java.util.Scanner;
import java.util.ArrayList;

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

  ArrayList<KoLapp> koLapper = new ArrayList<>();
  int teller = 0;

  public void trekkKoLapp() {
    teller++;
    KoLapp nyLapp = new KoLapp(teller);
    kolapper.add(nylapp);

    System.out.print("Du har fått tildelt billettnr ");
    System.out.println(nyLapp.getNummer() + ".");
    System.out.println("Det står " + (koLapper.size()-1)) + " foran deg. \n");
  }

  public void betjenKunde() {
    if (koLapper.isEmpty()) {
      System.out.println("ingen er i kø");
    } else {
      KoLapp betjenes = koLapper.remove(0);
      System.out.print("Kunde med billettnr: ");
      System.out.println(betjenes.getNummer() + " er betjent. \n");
    }
  }

  public int antKunder() {
    return koLapper.size();
  }

  public void printKunderIKo() {
    System.out.println("Disse er i ko: ");

    for(KoLapp kolapp : koLapper) {
      System.out.print("nr." + koLapp.getNummer() + ", ");
    }
    System.out.println("\n\n");
  }
}

class KoProgram {
  public static void main (String[] args) {

  }
}
