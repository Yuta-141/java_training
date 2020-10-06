abstract class A{
    abstract public void show();
}

class B extends A{
    public void show() {
        System.out.println("B.show");
    }
}

class C extends A{
    public void show(){
        System.out.println("C.show");
    }
}

class Test{
    public static void main(String[] args){
   //     showA(new A()); // can not make instance
        showA(new B());
        showA(new C());

    }
    public static void showA(A value){
        value.show();
    }
}
