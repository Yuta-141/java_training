class A{
    public static void show(){
        System.out.println("Kitty on your lap");
    }
}

class  B extends A{
    public static void show(){
        A.show();
        System.out.println("〜あなたの膝の仔猫〜");
    }
}

class Test{
    public static void main(String[] args){
        ((A) new B()).show();
        new B().show();
    }
}
