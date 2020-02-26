class TestBeholder {
  public static void main(String[] args) {
    Beholder<Sirkel> sirkelbeholder = new Beholder<>();
    sirkelbeholder.settInn(new Sirkel(10));
    sirkelbeholder.taUt().utskrift();
  }
}
