class PasoFino extends Hest implements KanToelte {

  public PasoFino(String n, int a) {
    super(n, a);
  }

  @Override
  public void toelt() {
    System.out.println("PasoFino kan toelte");
  }
}
