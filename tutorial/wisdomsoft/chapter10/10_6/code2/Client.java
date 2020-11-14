import java.net.*;
import java.io.*;

public class Client{
	public static void main(String[] args) throws Exception{
		Socket sock = new Socket(args[0] ,5893);
		BufferedReader in = new BufferedReader(
			new InputStreamReader(sock.getInputStream())
		);
		String msg = in.readLine();
		in.close();
		sock.close();

		System.out.println(msg);
	}
}
