import java.io.*;

public class Test{
    public static void main(String[] args) throws Exception {
        InputStream in = new FileInputStream(args[0]);

        while(true){
            byte[] data = {(byte) in.read()};
            if(data[0] == -1) break;
            else System.out.print(new String(data));
        }
        in.close();
    }
}
