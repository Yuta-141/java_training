class Test8_2_5{
    public static void main(String[] args) {
        try{
            System.out.println("try　ブロックです");
            System.out.println("args[0] = " + args[0]);
            System.out.println("try　ブロックを正常に終了します");
        }
        finally {
            System.out.println("finally ブロックです");
        }
        System.out.println("try文を終了しました");
    }
}