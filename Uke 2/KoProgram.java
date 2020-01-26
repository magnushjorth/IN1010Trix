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
    System.out.println("Det står", (koLapper.size()-1), "foran deg. \n");
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
    KoSystem koSystem = new KoSystem();
    Scanner scanner = new Scanner(System.in);
    int valg = 0;

    while (valg != 4) {
      printMeny();
      valg = Integer.parseInt(scanner.nextLine());

      if (valg == 1) {
        koSystem.trekkKoLapp();
      } else if (valg == 2) {
        koSystem.betjenKunde();
      } else if (valg == 3) {
        koSystem.printKunderIKo();
      } else if (valg == 4) {
        System.out.println("Programmet avsluttes.");
      } else {
        System.out.println("Error: tast 1, 2, 3 eller 4");
      }
    }
  }

  public static void printMeny() {
    String meny = "**MENY FOR BILLETTSYSTEM**";
    meny += "1 - Trekk ny kølapp\n";
    meny += "2 - Betjen kunde\n";
    meny += "3 - Print antall i kø\n";
    meny += "4 - Avslutt\n";

    System.out.println(memy);
  }
}
