class Skyskraper extends Bygning {
  protected int antallEtasjer;

  public Skyskraper(double buttoAeal, int atllEtaser ) {
    super(buttoAeal);
    antallEtasjer = atllEtaser;
    System.out.println("Dette er en skyskraper.");

  }
}
