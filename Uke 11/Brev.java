
public class Brev extends Post {

    public Brev(String innhold, String mottaker) {
        super(innhold, mottaker); 
    }

    @Override
    public String toString() {
        return "Mottaker: " + mottaker + "\nPOST-Innhold: " + innhold;
    }
}