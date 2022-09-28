package V0;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        boolean serverListening = false;
        int port = 8080;
        BufferedReader in;
        PrintWriter out;
        final Scanner sc=new Scanner(System.in);

        try {
            serverSocket = new ServerSocket(port);
            serverListening = true;
        } catch (IOException e) {
            System.out.println("Server: puerto no disponible");
        }

        if(serverListening){
            System.out.println("Escuchando puerto: "+port);
            Socket socket = null;
            try {
                socket = serverSocket.accept();

                //listos para escribir
                out = new PrintWriter(socket.getOutputStream());
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                Thread sender= new Thread(new Runnable() {
                    String msg; //variable that will contains the data writter by the user
                    @Override   // annotation to override the run method
                    public void run() {
                        while(true){
                            msg = sc.nextLine(); //reads data from user's keybord
                            out.println(msg);    // write data stored in msg in the clientSocket
                            out.flush();   // forces the sending of the data
                        }
                    }
                });
                sender.start();

                Socket finalSocket = socket;
                ServerSocket finalServerSocket = serverSocket;
                Thread receive= new Thread(new Runnable() {
                    String msg ;
                    @Override
                    public void run() {
                        try {
                            msg = in.readLine();
                            //mientras que el cliente este conectado
                            while(msg!=null){
                                System.out.println("Client : "+msg);
                                msg = in.readLine();
                            }

                            System.out.println("Client desconectado");

                            out.close();
                            finalSocket.close();
                            finalServerSocket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
                receive.start();
            } catch (IOException e) {
                System.out.println("Server: error en socket");
            }
        }
    }
}
