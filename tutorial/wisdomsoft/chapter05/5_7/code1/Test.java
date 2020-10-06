interface IVisibility{
    void show();
}

class A implements IVisibility{
    public void show() {
        System.out.println("A class's show()");
    }
}

class Test implements IVisibility {
    public static void main(String[] args){
        IVisibility obj = new A();
        obj.show();

        obj = new Test();
        obj.show();
    }
    public void show() {
        System.out.println("Test class's show()");
    }
}
