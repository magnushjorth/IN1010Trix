import java.util.ArrayList;

public class Student {
  private String navn;
  private ArrayList<String> fagliste;

  public Student(String nvn) {
    navn = nvn;
    fagliste = new ArrayList<String>();
  }

  public void leggTilFag(String fag) {
    fagliste.add(fag);
  }

  public void fjernFagFraStudent(String fag) {
    for (int i = 0; i < fagliste.size(); i++) {
      String tempNavn = fagliste.get(i);
      if (tempNavn.equals(fag)){
        fagliste.remove(i);
      }
    }
  }

  public int hentAntallFag() {
    return fagliste.size();
  }

  public String hentStudentNavn() {
    return navn;
  }

  public void skrivFagPaaStudent() {
    for (String fag : fagliste) {
      System.out.println(fag);
    }
  }
}
