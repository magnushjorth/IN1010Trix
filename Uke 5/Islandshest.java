class Islandshest extends Hest implements KanToelte, KanPasse {

  public Islandshest(String n, int a) {
    super(n, a);
  }

  @Override
  public void toelt() {
    System.out.println("Islandshest kan toelt");
  }

  @Override
  public void pass() {
    System.out.println("Islandshest kan pass");
  }
}
