

class Baat {
  private static int antProd = 0;
  private int prodnr;
  private String merke;

  public Baat(String mrk) {
    prodnr = antProd;
    antProd++;
    merke = mrk;
  }

  public String hentInfo() {
    return "Produksjonsnummer: " + prodnr + "\nMerke: " + merke;
  }
}

class Baathus {
  private Baat[] baathus;

  public Baathus(int antallPlasser) {
    baathus = new baathus[antallPlasser];
  }

  public void settInn(Baat enBaat) {
    boolean sattInn = false;
    int teller = 0;

    while (teller < baathus.length && sattInn == false) {
      if (baathus[teller] == null) {
        baathus[teller] = enBaat;
        sattInn = true;
      }

      teller++;
    }

    if (sattInn != true) {
      System.out.println("Det er ikke plass til flere baater!");
    }

    public void skrivBaater() {
      for (int i = 0; i < baathus.length; i++) {
        System.out.println(baathus[i].hentInfo());
      }
    }
  }
}
