public class Main{
    public static void main(String[] args){
        AbstractDisplay d1 = new CharDisplay('H');
       // "Hello world"を持ったString display のインスタンスを作る
       AbstractDisplay d2 = new StringDisplay("Hello. world.");
       //"こんにちは"
       AbstractDisplay d3 = new StringDisplay("こんにちは。");
       d1.display();
       d2.display();
       d3.display();
    }
}
