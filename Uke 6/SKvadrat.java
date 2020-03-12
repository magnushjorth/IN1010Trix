class SKvadrat {
  double lengde;

  public SKvadrat(double lengde) {
    this.lengde = lengde;
  }

  public double areal() {
    return lengde * lengde;
  }

  public double omkrets() {
    return 4*lengde;
  }
}
