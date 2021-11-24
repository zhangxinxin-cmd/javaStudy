import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServeDemo01 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket(888);
        byte[] bytes=new byte[1024];
        DatagramPacket packet=new DatagramPacket(bytes,bytes.length);
        socket.receive(packet);
        socket.close();
        System.out.println(packet.getSocketAddress());
        System.out.println(packet.getAddress());
        System.out.println(new String(bytes,0,packet.getLength()));
    }
}