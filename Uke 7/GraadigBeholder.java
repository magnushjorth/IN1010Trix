class GraadigBeholder <T extends Comparable <T>> {
  T mittElement;

  public void sett(T nyType) {
    if (mittElement == null) {
      mittElement = nyType;
      return null;
    } else if (nyType.compareTo(mittElement) >= 0) {
      T hjelpePeker;
      hjelpePeker = mittElement;
      mittElement = nyType;
      return hjelpePeker;
    } else {
      return null;
    }
  }

  public T hent() {
    return mittElement;
  }
}
