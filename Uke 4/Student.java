class Student extends Person {
  protected String kurs;
  protected String laereSted;

  public Student(String nvn, int alder, String kus, String lareSted) {
    super(nvn, alder);
    kurs = kus;
    laereSted = lareSted;
  }

  public boolean harTilgang() {
    return false;
  }
}
