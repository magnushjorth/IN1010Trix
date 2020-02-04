class testFigur {
  public static void main(String[] args) {
    Figur t = new Trekant(2, 3);
    Figur s = new Sirkel(3);
    Figur r = new Rektangel(3, 7);
    Figur[] fig = {t, s, r};
    System.out.println(r.areal());
    for (int i = 0; i < 3; i++) {
      System.out.println(fig[i].areal());
    }
    Sirkel si = null;

    if (s instanceof Sirkel) {
      si = (Sirkel) s;
    }
    si.utskrift();

    /*

    if (s instanceof Sirkel) {
      Sirkel si = (Sirkel) s;
      si.utskrift();
    }
    */

  }
}
