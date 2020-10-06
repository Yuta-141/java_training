class A{
    public static String str = "Kitty on your lap";
}

class B extends A{
    public static String str = A.str + "あなたの膝の子猫";
    public void show(){
        System.out.println(str);
    }
}

class  Test{
    public static void main(String[] args){
        new B().show();

        A ab = new B();
        System.out.println(ab.str);
    }
}
