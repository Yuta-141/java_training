public class StringDisplay extends AbstractDisplay{
    private String string; // output string
    private int width;  // width of string calculated in bytes
    public StringDisplay(String string){
        this.string = string ; // set sting to field
        this.width = string.getBytes().length; //set width to field

    }
    public void open(){
        printLine();
    }
    public void print(){
        System.out.println("[" + string +"]");
    }
    public void close(){
        printLine();
    }
    private void printLine(){
        System.out.print("+");
        for(int i = 0; i < width; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    
}
