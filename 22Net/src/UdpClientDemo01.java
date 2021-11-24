import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClientDemo01 {
    public static void main(String[] args) throws IOException {
        //建立socket
        DatagramSocket socket=new DatagramSocket();
        String message="你好服务器";
        //建个包
        InetAddress address = InetAddress.getByName("127.0.0.1");
        DatagramPacket packet = new DatagramPacket(message.getBytes(),message.getBytes().length,address,888);
        socket.send(packet);
        socket.close();
    }
}
