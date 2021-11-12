import java.util.concurrent.Callable;

public class CallableTest {
    public static void main(String[] args) {

    }
}

class CallableImplements<V> implements Callable<V> {

    @Override
    public V call() throws Exception {
        return null;
    }
}