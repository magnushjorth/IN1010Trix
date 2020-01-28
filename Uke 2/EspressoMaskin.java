class EspressoMaskin {
  private int vannmengde = 0;

  public EspressoMaskin(int vannmengde) {
    this.vannmengde = vannmengde;
  }

  public void lagEspresso() {
    if (vannmengde >= 40) {
      System.out.println("Her har du en Espresso");
      vannmengde -= 40;
    } else {
      System.out.println("Det er ikke nok vann");
    }
  }

  public void lagLungo() {
    if (vannmengde >= 110) {
      System.out.println("Her har du en Lungo");
      vannmengde -= 110;
    } else {
      System.out.println("Det er ikke nok vann");
    }
  }

  public void fyllVann(int vm) {
    if ((vannmengde + vm) <= 1000) {
      vannmengde += vm;
      System.out.println("Fylt på med " + vm + " ml vann.");
      System.out.println("Det er nå " + vannmengde + " ml på tanken.");
    } else {
      System.out.println("Det er ikke plass til så mye vann.");
    }
  }

  public int hentVannmengde() {
    return vannmengde;
  }
}
