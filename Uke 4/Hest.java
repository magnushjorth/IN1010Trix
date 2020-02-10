abstract class Hest {
  String navn;
  int alder;

  public Hest(String n, int a) {
    navn = n;
    alder = a;
  }

  public void skritt() {
    System.out.println(navn + " gaar fremover.");
  }

  public void trav() {
    System.out.println(navn + " ´jogger` med hoyre fremben og venstre tre bakben, deretter motsatt.");
  }

  public void galopp() {
    System.out.println(navn + " beveger seg raskt med beina i tret akt.");
  }
}
