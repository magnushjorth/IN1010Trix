import java.util.ArrayList;

class Telefonbok {
  public static void main(String[] args) {
    Person lars = new Person("Lars", "973 31 471", "Operagata");
    Person petter = new Person("Petter", "412 73 983", "Standgata");
    Person henning = new Person("Henning", "22 74 12 61", "Myntgata");

    ArrayList<Person> telefonliste = new ArrayList<>();
    telefonliste.add(lars);
    telefonliste.add(petter);
    telefonliste.add(henning);

    for (Person p : telefonliste) {
      p.skrivInfo();
    }
  }
}
