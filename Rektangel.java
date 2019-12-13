class Rektangel {
  double bredde;
  double lengde;

  public Rektangel(double l, double b){
    lengde = l;
    bredde = b;
  }

  public void oekLengde(int okning){
    lengde += okning;
  }

  public void oekBredde(int okning){
    bredde += okning;
  }

  public double areal() {
    return lengde * bredde;
  }

  public double omkrets() {
    return (lengde*2) + (bredde*2);
  }
}

class RektangelHovedprogram {
  public static void main
  (String[] args) {
    Rektangel en = new Rektangel(5,9);
    Rektangel to = new Rektangel(10, 2);

    System.out.println("Areal: " + en.areal());
    System.out.println("Areal: " + to.areal());

    en.oekBredde(5);
    to.oekLengde(2);

    System.out.println("Omkrets: " + en.omkrets());
    System.out.println("Omkrets: " + to.omkrets());
  }
}
