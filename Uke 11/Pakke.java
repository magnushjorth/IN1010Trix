
public class Pakke extends Post {

    public Pakke(String innhold, String mottaker) {
        super(innhold, mottaker);
    }

    @Override
    public String toString() {
        return "Mottaker: " + mottaker + "\nPAKKE-Innhold: " + innhold;
    }
}