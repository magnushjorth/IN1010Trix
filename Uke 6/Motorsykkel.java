class Motorsykkel {
  private String regnr;
  private int motorstorrelse;

  public Motorsykkel(String regnr, int motorstorrelse) {
    this.regnr = regnr;
    this.motorstorrelse = motorstorrelse;
  }

  @Override
  public String toString() {
    return "Motorsykkel\nRegnr: " + regnr + "\nMotorstorrelse: " + motorstorrelse; 
  }
}
