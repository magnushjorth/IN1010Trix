class Student {
  String navn;
  int score;
  int antall;

  Student(String n, int s, int a) {
    navn = n;
    score = s;
    antall = a;
  }

  void getName() {
    System.out.println("Navn: " + navn);
  }

  void leggTilQuizScore(int s) {
    score += s;
    antall++;
  }

  void hentTotalScore() {
    System.out.println("Total Score: " + score);
  }

  void hentGjennomsnittligScore() {
    int gjennomsnitt = score / antall;
    System.out.println("Gjennomsnittlig Score " + gjennomsnitt);
  }
}

class QuizScore {
  public static void main (String[] args) {
    Student s1 = new Student("Petter", 10, 2);

    s1.getName();
    s1.leggTilQuizScore(5);
    s1.hentTotalScore();
    s1.hentGjennomsnittligScore();
  }
}
