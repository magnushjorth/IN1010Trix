class Parkeringshus {
  static Parkeringsplass[] etasje1 = new Parkeringsplass[10];
  static Parkeringsplass[] etasje2 = new Parkeringsplass[10];

  public static void main(String[] args) {
    Bil b1 = new Bil("EV93289", 4);
    Bil b2 = new Bil("EV43285", 5);
    Bil b2 = new Bil("EK84325", 7);

    Motorsykkel m1 = new Motorsykkel("AA2143", 125);
    Motorsykkel m2 = new Motorsykkel("BP4312", 250);
    Motorsykkel m3 = new Motorsykkel("EK2133", 50);

    etasje1[4] = new Parkeringsplass();
    etasje1[4].parker(b1);

    for (int i = 0; i < 10; i++) {
      if(etasje1[i] != null) {
        etasje1[i].hent();
        etasje1[i] = null;
      }
    }
  }
}
