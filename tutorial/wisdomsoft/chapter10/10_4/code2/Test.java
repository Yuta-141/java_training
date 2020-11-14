import java.io.*;

public class Test{
	public static void main(String[] args) throws Exception{
		File file = new File(args[0]);
		if (file.createNewFile()){
			System.out.println("create file");
		}
		else {
			System.out.println("create  failed...");
		}
	}
}
