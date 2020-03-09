class Person {
  private String navn;
  private String gjenstand;
  private Person neste;

  public Person (String navn, String gjenstand) {
    this.navn = navn;
    this.gjenstand = gjenstand;
  }

  public void settNeste (Person p) {
    neste = p;
  }

  public Person hentNeste () {
    return this.neste;
  }

  public String toString() {
    return navn + " med gjenstand " + gjenstand;
  }
}
