import java.net.*;
import java.io.*;

public class Test{
	public static void main(String[] args) throws Exception{
		byte buffer[] = new byte[0xFF];

		URL url = new URL(args[0]);
		OutputStream out = new FileOutputStream(args[1]);
		System.out.println(url.getHost() + ":connecting...");
		InputStream in = url.openStream();

		for(int i=0, len = 0; (len = in.read(buffer)) != -1;){
			i += len;
			System.out.print("downloading..." + i + "byte\r");
			out.write(buffer, 0 , len);
		}
		out.close();
	}
}
