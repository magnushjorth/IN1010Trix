class EnkelArrayList {
  private String[] arr;
  private int maksStorrelse;
  private int teller;

  public EnkelArrayList(int maksStorrelse) {
    this.maksStorrelse = maksStorrelse;
    arr = new String[maksStorrelse]
  }

  public void leggInn(String tekst) {
    if (maksStorrelse >= storrelse) {
      System.out.println("Ikke nok plass");
    } else {
      arr[teller] = tekst;
    }
  }
}
