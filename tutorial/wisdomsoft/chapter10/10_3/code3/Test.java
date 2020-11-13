import java.io.*;

public class Test{
    public static void main(String[] args) throws Exception {
        InputStream in = new FileInputStream(args[0]);
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        while(reader.ready()) System.out.println(reader.readLine());

        reader.close();
        in.close();
    }
}
