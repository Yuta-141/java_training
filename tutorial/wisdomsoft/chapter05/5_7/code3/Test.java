interface A {
    void a();
}

interface B extends A{
    void a();
    void b();
}

class Test implements B{
    public static void main(String[] args){
        B obj = new Test();
        obj.a();
        obj.b();
    }
    public void a(){
        System.out.println("A.a() method");
    }
    public void b(){
        System.out.println("B.b() method");
    }
}
