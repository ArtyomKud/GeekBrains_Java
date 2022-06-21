package groupId.klienr_server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    Scanner scanner = new Scanner(System.in);
    Socket socket = null;

    public static void main(String[] args) {
        Server server = new Server();
       server.creatConnect();






    }
    public void creatConnect(){

        try {
            ServerSocket serverSocket = new ServerSocket(8189);
            System.out.println("Жду подключения");
            socket=serverSocket.accept();
            System.out.println("Клиент подключился");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            //отправляем сообщения
            new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        while (true){
                            String str1 = scanner.nextLine();
                            if(!str1.trim().isEmpty()){

                        out.writeUTF(str1);
                            }
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }).start();




//Получаем сообщения
                    while (true){
                        String str2 = null;
                        try {
                            str2 = in.readUTF();
                            if(str2.equalsIgnoreCase("/end")){
                                out.writeUTF("/end");
                                break;
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Сообщение от клиента: "+str2);
                    }




        } catch (IOException e) {
            e.printStackTrace();
        }



    }
    public void outSystem (){

    }




}
