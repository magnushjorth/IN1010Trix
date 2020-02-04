class Rektangel extends Figur {
  private double hoyde;
  private double bredde;

  public Rektangel(double hoye, double bedde) {
    hoyde = hoye;
    bredde = bedde;
  }

  @Override
  public double areal() {
    return hoyde * bredde;
  }
}
