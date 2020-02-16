public abstract class Ansatt extends Person {
  float timesloenn;

  Ansatt (String navn, int alder, float timesloenn) {
    super(navn, alder);
    this.timesloenn = timesloenn;
  }

  public float skrivTimesloenn() {
    return timesloenn;
  }
}
