package lecture.inflearn_java.webserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) throws IOException {
        // 클라이언트가 접속할 때까지 대기할때 필요한 객체가 ServerSocket
        ServerSocket serverSocket = new ServerSocket(10000);
        System.out.println(1);
        while (true) {
            Socket clientSocket = serverSocket.accept(); // 대기한다. 클라이언트가 접속하면 클라이언트와 통신하는 Socket이 반환된다.
            WebThread webThread = new WebThread(clientSocket);
            webThread.start();
        }
    }
}

class WebThread extends Thread {
    private Socket socket;
    public WebThread(Socket socket) {
        this.socket = socket;
    }
    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            System.out.println(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}