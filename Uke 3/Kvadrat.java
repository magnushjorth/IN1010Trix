class Kvadrat extends Figur {
  private double sidelengde;

  public Kvadrat(double sdelengde) {
    sidelengde = sdelengde;
  }

  @Override
  public double areal() {
    return sidelengde * 2;
  }
}
