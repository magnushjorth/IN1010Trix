import java.util.HashMap;

class Hovedstad {
  public static void main(String[] args) {
    HashMap<String, String> hovedstad = new HashMap<String, String>();

    hovedstad.put("England", "London");
    hovedstad.put("Germany", "Berlin");
    hovedstad.put("Norway", "Oslo");
    hovedstad.put("USA", "Washington DC");

    if (hovedstad.containsKey("Norway")) {
      System.out.println(true);
    }

    for (String nokkel : hovedstad.keySet()) {
      System.out.println(nokkel);
    }

    for (String innhold : hovedstad.values()) {
      System.out.println(innhold.hovedstad());
    }

  }
}
