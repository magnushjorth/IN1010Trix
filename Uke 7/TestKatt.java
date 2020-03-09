import java.util.ArrayList;

class TestKatt {
  public static void main(String[] args) {
    ArrayList<Katt> liste = new ArrayList<Katt>();
    liste.add(new Katt("Nils", 3));
    liste.add(new Katt("Henrik", 7));
    liste.add(new Katt("Fredrik", 5));
    liste.add(new Katt("Franz", 11));
    liste.add(new Katt("Simen", 9));

    Katt eldsteKatt = liste.get(0);

    for (Katt k : liste) {
      if (k.compareTo(eldsteKatt) > 0) {
        eldsteKatt = k;
      }
    }
    System.out.println(eldsteKatt);
  }
}
