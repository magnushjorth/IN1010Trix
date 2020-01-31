import java.util.ArrayList;

public class Fag {
  private String fagnavn;
  private ArrayList<String> studentliste;

  public Fag(String fagn) {
    fagnavn = fagn;
    studentliste = new ArrayList<String>();
  }

  public void leggTilStudent(String student) {
    studentliste.add(student);
  }

  public void fjernStudentFraFag(String student) {
    for (int i = 0; i < studentliste.size(); i++) {
      String tempNavn = studentliste.get(i);
      if (tempNavn.equals(student)){
        studentliste.remove(i);
      }
    }
  }

  public int hentAntallStudenter() {
    return studentliste.size();
  }

  public void skrivStudenterVedFag() {
    for (String student : studentliste) {
      System.out.println(student);
    }
  }

  public String hentFagnavn() {
    return fagnavn;
  }
}
