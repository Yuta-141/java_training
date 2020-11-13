public class Test{
    public static void main(String[] args) throws Exception{
        byte[] data = new byte[0xFF];
        System.out.println("input strings");
        int len = System.in.read(data);
        System.out.print("入力した文字 = " + new String(data, 0,len));
    }
}
