class Sirkel extends Figur {
  private double radius;

  public Sirkel(double rdius) {
    radius = rdius;
  }

  public void utskrift() {
    System.out.println(radius);
  }

  @Override
  public double areal() {
    return 3.14 * radius * radius;
  }
}
