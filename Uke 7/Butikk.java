import java.util.Iterator;

class Butikk implements Iterable<Person> {
  private Person foerste;

  public void settInn(Person p) {
    if (this.foerste == null) {
      this.foerste = p;
    } else {
      Person midlertidig = foerste;
      while (midlertidig.hentNeste() != null) {
        midlertidig = midlertidig.hentNeste();
      }
      midlertidig.settNeste(p);
    }
  }

  public Iterator<Person> iterator() {
    return new PersonIterator();
  }

  public void gaaTilKassen() {
    while (foerste != null) {
      System.out.println("Behandler kunde: " + foerste);
      foerste = foerste.hentNeste();
    }
    System.out.println("Tomt for kunder!");
  }
}
