package V2;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Cliente {
    public static void main(String[] args) {
        if (args.length!=2){
            System.out.println("Usage: java Client [ipServer] [folderToBeCopied]");
        }else{
            String host = args[0];
            String foldername = args[1];
            int port = 8080;
            boolean isConnected = false;

            Socket socket = null;
            ObjectOutputStream out = null;

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
                File folder = new File(foldername);
                if(folder.exists() && folder.isDirectory()){
                    try {

                        String[] files = folder.list();
                        //folder.listFiles();
                        System.out.println("Client: encontrados "+files.length+" archivos");
                        out = new ObjectOutputStream(socket.getOutputStream());

                        for (String file:files){
                            File f = new File(foldername+"/"+file);
                            if(f.isFile()){
                                FileToBeTransfer ftbt = new FileToBeTransfer(f.getName(), (int) f.length());
                                FileInputStream in = new FileInputStream(f);
                                ftbt.setFileData(in.readAllBytes());
                                out.writeObject(ftbt);
                                //flush
                                out.flush();
                                System.out.println("Client: archivo transferido con exito");
                            }
                        }
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
