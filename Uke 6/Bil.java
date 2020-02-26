class Bil {
  private String regnr;
  private int passasjerseter;

  public Bil(String regnr, int passasjerseter) {
    this.regnr = regnr;
    this.passasjerseter = passasjerseter;
  }

  @Override
  public String toString() {
    return "Bil\nRegnr: " + regnr + "\nPassasjerseter: " + passasjerseter;
  }
}
