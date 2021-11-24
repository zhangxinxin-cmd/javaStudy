import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(999);
        Socket socket = serverSocket.accept();
        OutputStream outputStream = socket.getOutputStream();
        File file=new File("D:\\idealProjects\\basic-code\\22Net\\infinity-8484238.jpg");
//        boolean newFile = file.createNewFile();
        FileInputStream fileInputStream = new FileInputStream(file);
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fileInputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }
        outputStream.close();
        fileInputStream.close();
        socket.close();
        serverSocket.close();

    }
}