package V1;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        boolean serverListening = false;
        int port = 8080;

        try {
            serverSocket = new ServerSocket(port);
            serverListening = true;
        } catch (IOException e) {
            System.out.println("Server: puerto no disponible");
        }

        if(serverListening){
            System.out.println("Server: escuchando por el puerto "+port);
            Socket socket = null;
            try {
                socket = serverSocket.accept();
                //listos para pricesar
                DataInputStream in = new DataInputStream(socket.getInputStream());
                String filename= LocalTime.now().toString().replace(":","-")+".txt";
                FileOutputStream out = new FileOutputStream(filename);
                byte[] buffer = new byte[1024];
                int nBytes = 0;
                while ((nBytes=in.read(buffer))>0){
                    out.write(buffer,0,nBytes);
                }
                out.close();
                in.close();

            } catch (IOException e) {
                System.out.println("Server: error en socket");
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Server: closed");
    }
}
