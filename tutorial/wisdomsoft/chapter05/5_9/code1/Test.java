interface I {}
class A {}
class B extends A{}
class C extends B implements I {}

class Test implements I {
    public static void main(String[] args){
        check(new C());
        check(new B());
        check(new Test());
        
    }
    public static void check(Object obj){
        System.out.println("----"+ obj.toString() +"----");
        System.out.println("instanceof I = "+(obj instanceof I));
        System.out.println("instanceof A = "+(obj instanceof A));
        System.out.println("instanceof B = "+(obj instanceof B));
        System.out.println("instanceof C = "+(obj instanceof C));
        System.out.println("-----------------------\n");
        
    }
}
