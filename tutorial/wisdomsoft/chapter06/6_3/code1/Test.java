class Parent {
    public String str;
    public Child getChild(){
        Child temp = new Child();
        return temp;
    }
    class Child {
        public void show(){
            System.out.println(str);
        }
    }
}

class Test{
    public static void main(String[] args){
        Parent p = new Parent();
        Parent.Child c = p.new Child();

        p.str = "Kitty on your lap";
        c.show();
        p.getChild().show();
    }
}
