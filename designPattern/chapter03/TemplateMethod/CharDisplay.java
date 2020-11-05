public class CharDisplay extends AbstractDisplay{ // CharDiaplay is subclass of AbstractDisplay
    private char ch;// caracters to display
    public CharDisplay(char ch){ // 
        this.ch = ch; 
    }
    public void open(){ // abstract method override
        System.out.print("<<");
    }
    public void print(){//implements print method    

        System.out.print(ch);
    
    }
    public void close(){// close method
        System.out.println(">>");
    }
    
}
