class StaticField{
    public static String str = "StaticField";
}

class Parent{
    public String str = "Parent";
    public class Child extends StaticField{
        public String str = "Child";
        public void showStr(){
            System.out.println(super.str);
            System.out.println(str);
        }
    }
}

class Test{
    public static void main(String[] args){
        Parent.Child c = new Parent().new Child();
        c.showStr();
    }
}
