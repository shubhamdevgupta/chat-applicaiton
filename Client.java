
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class Client {


    BufferedReader br;
    PrintWriter out;
    Socket socket;

public Client(){
    try {
        System.out.println("Sending request to server");
    socket =new Socket("127.0.0.1",7777);
        System.out.println("connection done");
        br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());
            
            startReading();
            startWriting();



    } catch (Exception e) {
        e.printStackTrace();
    }

}
public void startReading(){
    System.out.println("writer started");
    Runnable r = ()->{
            try {
                while(!socket.isClosed()){
                  String msg= br.readLine();
                  if(msg.equals("exit")){
                    System.out.println("Server terminated the chat");
                    socket.close();
                    break;
                  }
                  System.out.println("server :"+msg);
                }

            } catch (Exception e) {

                System.out.println("connection is closed");
            }  

    };
    new Thread(r).start();
}

public void startWriting(){
        Runnable r2=()->{
            try {
                while(!socket.isClosed()){
                    BufferedReader br2 =new BufferedReader(new InputStreamReader(System.in));
                    String content=br2.readLine();
                    out.println(content);
                    out.flush();
                    if(content.equals("exit")){
                        socket.close();
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("connection is closed");
            }
        };
        new Thread(r2).start();
}



    public static void main(String[] args) {
        System.out.println("server started");
        new Client();

    }
}
