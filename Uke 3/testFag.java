public class testFag {
  public static void main(String[] args) {
    Fag f1 = new Fag("IN1010");
    f1.leggTilStudent("Magnus");
    f1.leggTilStudent("Benjamin");
    f1.leggTilStudent("Kristoffer");

    System.out.println(f1.hentAntallStudenter());
    f1.fjernStudentFraFag("Magnus");
    System.out.println(f1.hentAntallStudenter());

    f1.skrivStudenterVedFag();
    System.out.println(f1.hentFagnavn());
  }
}
