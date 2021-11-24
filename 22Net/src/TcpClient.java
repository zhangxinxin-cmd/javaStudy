import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 999);
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = new FileOutputStream("D:\\idealProjects\\basic-code\\22Net\\infinity-8484238Copy.jpg");
        int len;
        byte[] bytes = new byte[1024];
        int count=0;
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes,0,len);
            count++;
        }
        System.out.println(count);
        outputStream.close();
        inputStream.close();
        socket.close();
    }
}
