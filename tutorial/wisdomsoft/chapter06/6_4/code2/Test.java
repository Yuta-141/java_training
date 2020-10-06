interface IShow{
    void show();
}

class Test{
    String name = "Kitty on your lap";
    public static void main(String[] args){
        Test.createShow().show();
        new Test().getShow().show();
    }

    public static IShow createShow(){
        class Local implements IShow{
            public void show(){
                System.out.println(toString() + ": Test. createShow() .Local");
            }
        }
        return new Local();
    }
    
    public IShow getShow(){
        class Local implements IShow{
            public void show(){
                System.out.println(toString() + " : " + name);
            }
        }
            return new Local();
    }
}
