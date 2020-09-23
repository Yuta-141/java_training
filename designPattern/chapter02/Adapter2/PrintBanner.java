public class PrintBanner extends Print{
    private Banner banner;
    public PrintBanner(String string) {
        super(string);
    }
    public void printWeak(){
        showWithParen();
    }
    public void printStrong(){
        showWithAster();
    }
}
