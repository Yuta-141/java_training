interface IMessageStyle{
    int INFORMATION = 2, WARNING = 4, QUESTION = 8; 
}

class Test implements IMessageStyle{
    public static void main(String[] args){
        message("Kitty on your lap",INFORMATION);
        message("Kitty on your lap",WARNING);
        message("Kitty on your lap",IMessageStyle.QUESTION);
    }
    public static void message(String msg,int style){
        switch(style){
            case INFORMATION:
                System.out.println("[normal message]"+msg);
                break;
            case WARNING:
                System.out.println("!warning!"+msg);
                break;
            case QUESTION:
                System.out.println("?question?"+msg);
                break;

        }
    }
}
