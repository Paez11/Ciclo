package V1;

import java.io.*;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) {
        if (args.length!=2){
            System.out.println("Usage: java Client [ipServer] [fileToBeCopied]");
        }else{
            String host = args[0];
            String filename = args[1];
            int port = 8080;
            boolean isConnected = false;

            Socket socket = null;
            DataOutputStream out = null;
            InputStream input = null;

            try {
                socket = new Socket(host, port);
                isConnected=true;
            } catch (IOException e) {
                System.out.println("Client: server no disponible");
            }
            if (isConnected){
                System.out.println("Client: conectado");
                /**
                 * detectar si el archivo existe
                 */
                File file = new File(filename);
                if(file.exists() && file.isFile()){
                    try {
                        out = new DataOutputStream(socket.getOutputStream());
                        input = new FileInputStream(file);
                        int nBytes = 0;
                        byte[] buffer = new byte[1024];
                        while ((nBytes = input.read(buffer))>0){
                            out.write(buffer,0,nBytes);
                        }
                        input.close();
                        out.close();
                    } catch (IOException e) {
                        System.out.println("error en socket");
                    }
                }else{
                    System.out.println("Client: archivo no disponible");
                }
                try {
                    socket.close();
                } catch (IOException e) {

                }
                System.out.println("killed");
            }
        }
    }
}
