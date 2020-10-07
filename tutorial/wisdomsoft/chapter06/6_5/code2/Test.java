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
        return new IShow(){
            public void show(){
                System.out.println(toString() + " : Test . createShow() . Local");
            }
        };
    }
    public IShow getShow(){
        return new IShow(){
            public void show(){
                System.out.println(toString() + " : " + name);
            }
        };
    }
}
