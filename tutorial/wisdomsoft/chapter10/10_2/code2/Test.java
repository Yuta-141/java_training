import java.io.*;

class Test{
    public static void main(String[] args){
        try{
            OutputStream out = new FileOutputStream("test.txt");
            PrintWriter writer = new PrintWriter(out);
            writer.println("Kitty on your lap");
            writer.close();
            out.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
