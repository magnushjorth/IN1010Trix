public class KoLapp{
  private int nummer;

  public KoLapp(int nummer){
    this.nummer = nummer;
  }

  public int hentNummer(){
    return nummer;
  }

  @Override
  public String toString() {
    return "Kolapp: " + hentNummer(); 
  }
}
