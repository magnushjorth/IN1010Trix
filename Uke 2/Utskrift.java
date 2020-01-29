class Utskrift {
  public static void main(String[] args) {
    String enTekst = "Her er en tekst";
    int tall1 = 2;
    int tall2 = 5;

    utskrift1(enTekst);
    utskrift2(tall1);
    utskrift3(tall1, tall2);
  }

  public static void utskrift1(String tekst) {
    System.out.println(tekst);
  }

  public static void utskrift2(int tall) {
    System.out.println(tall);
  }

  public static void utskrift3(int tall1, int tall2) {
    System.out.println(tall1 + tall2);
  }
}
