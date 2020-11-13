import java.io.*;
public class Test{
    public static void main(String[] args){
        byte[] data = { 0x4B, 0x69, 0x74, 0x74, 0x79};
        try{
            OutputStream out = new FileOutputStream("test.txt");
            out.write(data);
            out.close();
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
}
