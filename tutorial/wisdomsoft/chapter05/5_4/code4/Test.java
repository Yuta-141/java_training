class A{
    public void show(){
        System.out.println("Kitty on your lap");
    }
}

class B extends A{
    public void show(){
        super.show();
        System.out.println("\t~あなたの膝の仔猫~");
    }
}

class Test{
    public static void main(String[] args){
        B bb = new B();
        A ab = bb;

        bb.show();
        ab.show();
    }
}
