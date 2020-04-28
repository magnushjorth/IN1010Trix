
public class Post {
    String innhold;
    String mottaker;

    public Post(String innhold, String mottaker) {
        this.innhold = innhold;
        this.mottaker = mottaker;
    }

    public String hentInnhold() {
        return innhold;
    }

    public String hentMottaker() {
        return mottaker;
    }
    
    @Override
    public String toString() {
        return "Mottaker: " + mottaker + "\nInnhold: " + innhold;
    }
}