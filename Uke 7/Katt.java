class Katt implements Comparable<Katt> {
  String navn;
  int alder;

  public Katt(String navn, int alder) {
    this.navn = navn;
    this.alder = alder;
  }

  public int compareTo(Katt k) {
    if (this.alder < k.alder) {
      return -1;
    } else if (this.alder > k.alder) {
      return 1;
    } else {
      return 0;
    }
  }

  /*
  public int compareTo(Katt k) {
    return this.alder - k.alder;
  }

  */

  @Override
  public String toString() {
    return "\nNavn: " + navn + "\nAlder: " + alder;
  }
}
