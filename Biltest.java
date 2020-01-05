class Bil {
  private String eier;
  private String merke;

  public Bil(String navn, String type) {
    eier = navn;
    merke = type;
  }

  public void skrivEier() {
    System.out.println("Eier: " + eier);
  }

  public void skrivMerke() {
    System.out.println("Merke: " + merke);
  }
}

public class Biltest {
  public static void main (String[] args) {
    Bil en = new Bil("Lars", "Tesla");
    Bil to = new Bil("Petter", "Audi");

    en.skrivEier();
    en.skrivMerke();

    to.skrivEier();
    to.skrivMerke();
  }
}
