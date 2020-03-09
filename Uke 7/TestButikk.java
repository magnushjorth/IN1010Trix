class TestButikk {
  public static void main(String[] args) {
    Butikk butikken = new Butikk();

    butikken.settInn(new Person("Stig", "Sitronsaft"));
    butikken.settInn(new Person("Hedda", "Engangskopper"));
    butikken.settInn(new Person("Jawad", "Pasta"));
    butikken.settInn(new Person("Henrik", "Kaffe"));
    butikken.settInn(new Person("Mathias", "Tomatsuppe"));

    butikken.gaaTilKassen();
  }
}
