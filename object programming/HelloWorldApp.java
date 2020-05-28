import java.util.Scanner;
class Test{
    public static void test() {
        System.out.println("test class");
    }
}
class HelloWorldApp {
    public static void main(String[] args){
        // System.out.println("Hello World!");
        int a = 12;
        // System.out.println(a);
        // System.out.println("a は" + a +"です");

        // Scanner scan = new Scanner(System.in);

        // System.out.print("文字列:");
        // String str = scan.next();
        // System.out.println(str);
        // double e = Math.random();
        // System.out.println(e);
        // int A=5;
        // int B = 8;
        // int f= A+(int)(Math.random()*((B-A)+1));
        // System.out.println(f);

        Test t = new Test();
        t.test();
    }
}