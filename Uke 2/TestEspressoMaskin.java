class TestEspressoMaskin {
  public static void main(String[] args) {
    EspressoMaskin em = new EspressoMaskin(150);
    System.out.println(em.hentVannmengde());
    em.lagEspresso();
    em.lagLungo();
    System.out.println(em.hentVannmengde());
    em.fyllVann(50);
  }
}
