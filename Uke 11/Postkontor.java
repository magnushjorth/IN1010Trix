import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Postkontor {

    Post[] postHylle = new Post[10];

    Lock hylleLaas = new ReentrantLock();
    Condition ikkeFull = hylleLaas.newCondition();
    Condition ikkeTom = hylleLaas.newCondition();

    public int storrelse() {
        int storrelse = 0;
        for (int i = 0; i < postHylle.length; i++) {
            if (postHylle[i] == null) storrelse++;
        }
        return storrelse;
    }

    public void leverPost(Post post) {
        hylleLaas.lock();
        try {
            if (storrelse() == 10) {
                ikkeFull.await();
            }
            for (int i = 0; i < postHylle.length; i++) {
                if (postHylle[i] == null) {
                    postHylle[i] = post;
                    ikkeTom.signal();
                    return;
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {
            hylleLaas.unlock();
        }
    }

    public Post hentPost(String mottakerNavn) {
        hylleLaas.lock();

        try {
            if (storrelse() == 0) {
                ikkeTom.await();
            }
            for (int i = 0; i < postHylle.length; i++) {
                if (postHylle[i] != null) {
                    if (postHylle[i].hentMottaker().equals(mottakerNavn)) {
                        Post post = postHylle[i];
                        postHylle[i] = null;
                        ikkeFull.signal();
                        return post;
                    }
                }
            }
            ikkeTom.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {
            hylleLaas.unlock();
        }
        return null;
    }
}


