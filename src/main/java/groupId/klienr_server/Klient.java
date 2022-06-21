package groupId.klienr_server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Klient {
    private final String serverAdres = "localhost";
    private final int serverPort = 8189;
    Socket socket=null;
    private DataInputStream in;
    private DataOutputStream out;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Klient klient = new Klient();
        klient.openConnekt();
        klient.sendMessage();





    }






    public  void openConnekt (){
        try {
            socket= new Socket(serverAdres, serverPort);
            in = new DataInputStream(socket.getInputStream());
            out= new DataOutputStream(socket.getOutputStream());
            new  Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            String str = in.readUTF();
                            if (str.equalsIgnoreCase("/end")) {
                                closedConnection();
                                break;
                            }
                            System.out.println("Сообщение от сервера: "+str);

                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void closedConnection(){
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void sendMessage() {
        while (true) {
                try {
                    if(in.equals("/end")){
                        break;
                    }
                    out.writeUTF(scanner.nextLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

}
