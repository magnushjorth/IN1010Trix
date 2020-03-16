import java.util.ArrayList;

public class KoSystem{
  private ArrayList<KoLapp> koLapper = new ArrayList<KoLapp>();
  private static int teller = 0;
  private int koLappNr;

  //Lager et nytt objekt av KoLapp, printer ut informasjon om den og legger den til i listen over koLapper.
  public void trekkKoLapp(){
    koLappNr = teller;
    teller++;

    KoLapp nyLapp = new KoLapp(koLappNr);
    koLapper.add(nyLapp);

    System.out.println(nyLapp);
  }

  //Henter ut, printer ut informasjon og fjerner den forste kolappen i lista. Gir feilmelding dersom ingen kunder staar i ko.
  public void betjenKunde(){
    if ((koLapper.size()-1) > 0) {
      System.out.println(koLapper.get(0));
      koLapper.remove(1);
    } else {
      System.out.println("Det er ingen i koen!");
    }
  }

  //Returnerer antall kunder som er i ko.
  public int antKunder(){
    return koLapper.size()-1;
  }

  //Printer alle kunder i ko
  public void printKunderIKo(){
    for (KoLapp kl : koLapper) {
      System.out.println(kl);
    }
  }
}
