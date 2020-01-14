import java.util.ArrayList;

class Brevet {
  private String avsender;
  private String mottaker;
  private String linjer[];


  public Brevet(String a, String m) {
    this.avsender = a;
    this.mottaker = m;
    linjer = new ArrayList<String>();
  }

  public void skrivLinje(String l) {
    linjer.add(l);
  }

  public void lesBrev() {
    System.out.println("Hei!,", mottaker, "\n");
    for (int i = 0; i < linjer.length; i++) {
      System.out.println(linjer[i]);
    }
    println("Hilense fra,", avsender);
  }
}

class Brev {
  public static void main (String[] args) {
    Brev brevet = new Brev("Per Askeladd", "Espen Askeladd");

    brevet.skrivLinje("Hvordan har du det?");
    brevet.skrivLinje("Jeg har det bare bra!");
    brevet.lesBrev();
  }
}
