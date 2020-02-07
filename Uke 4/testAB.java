class testAB {
  public static void main(String[] args) {
    B b = new B();
    A a = b;

    a.skrivKlasse();
    b.skrivKlasse();
  }
}

/*
Når vi kaller på utskriftsmetodene vil vi bruke
B-objektets implementasjon av metoden. Derfor skriver vi ut "B" i
begge tilfeller, selv om det ene objektet har en A-referanse.
*/
