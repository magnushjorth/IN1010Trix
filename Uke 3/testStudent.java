public class testStudent {
  public static void main(String[] args) {
    Student s1 = new Student("Magnus");
    s1.leggTilFag("IN1010");
    s1.leggTilFag("IN1030");
    s1.leggTilFag("IN1050");
    s1.leggTilFag("IN1060");

    System.out.println(s1.hentAntallFag());
    s1.fjernFagFraStudent("IN1050");
    System.out.println(s1.hentAntallFag());

    System.out.println(s1.hentStudentNavn());
    s1.skrivFagPaaStudent();
  }
}
