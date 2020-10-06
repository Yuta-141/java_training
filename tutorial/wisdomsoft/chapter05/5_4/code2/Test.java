class A{
    public String str = "Kitty on your lap";
}

class B extends A{
    public String str = super.str + "あなたの膝の仔猫";
}

class Test{
    public static void main(String[] args){
        B bb = new B();
        A ab = bb;

        System.out.println(bb.str);
        System.out.println(ab.str);
    }
}
