class Test8_2_1{
    public static void main(String[] args) {
        try{int iValue = 10 / 0;}
        catch(ArithmeticException err){
            System.out.println("算術処理で例外が発生しました");
        }
    }
}