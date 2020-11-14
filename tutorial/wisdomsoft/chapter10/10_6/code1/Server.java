import java.net.*;
import java.io.*;

public class Server{
	public static void main(String[] args) throws Exception{
		ServerSocket server = new ServerSocket(5893);
		System.out.println("port: " + server.getLocalPort());

		while(true){
			Socket socket = server.accept();
			System.out.println(socket);
			OutputStreamWriter out = new OutputStreamWriter(socket.getOutputStream());
			out.write("Kitty on your lap");
			out.flush();
			socket.close();

		}
	}
}
