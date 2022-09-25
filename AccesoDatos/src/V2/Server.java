package V2;

import java.io.*;
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
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

                String foldername= LocalTime.now().toString().replace(":","-");
                File folder = new File(foldername);
                if(folder.mkdir()){

                    do {
                        FileToBeTransfer ftbt = (FileToBeTransfer) in.readObject();
                        String file = foldername + "/" + ftbt.getFileName();
                        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
                        out.write(ftbt.getFileData(), 0, ftbt.getFileSize());
                        out.close();
                    }while(socket.isConnected());
                }
                in.close();
                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                System.out.println("Server: error en socket");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
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
