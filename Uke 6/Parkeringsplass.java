class Parkeringsplass<E> {
  private E kjoeretoey;

  public void parker(E kjoeretoey) {
    this.kjoeretoey = kjoeretoey;
  }

  public E hent() {
    //Sparer paa kjoeretoey
    E tmp = this.kjoeretoey;

    //Fjerner elementet fra parkeringsplassen
    this.kjoeretoey = null;

    //Returnerer elementet
    return tmp;
  }
}
