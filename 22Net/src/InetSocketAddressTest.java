import java.net.InetSocketAddress;

public class InetSocketAddressTest {
    public static void main(String[] args) {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("www.github.com", 80);
        System.out.println(inetSocketAddress.getAddress());
    }
}
