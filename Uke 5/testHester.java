class testHester {
  public static void main(String[] args) {
    PasoFino pasofino = new PasoFino("Lars", 21);

    pasofino.skritt();
    pasofino.trav();
    pasofino.galopp();
    pasofino.toelt();

    Islandshest islandshest = new Islandshest("Petter", 34);

    islandshest.skritt();
    islandshest.trav();
    islandshest.galopp();
    islandshest.toelt();
    islandshest.pass();

  }
}
