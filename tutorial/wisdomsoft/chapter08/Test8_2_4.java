class Test8_2_4{
    public static void main(String[] args) {
        try{
            if(args[0].equals("/n")){
                String str = null;
                int i = str.length();
            }
            else if(args[0].equals("/c")){
                Test8_2_4 obj = (Test8_2_4)((Object)args);
            }
            System.out.println("正常にtryブロックを終了する");
        }
        catch (Exception err){
            System.out.println("例外が発生しました:" + err.toString());
        }
        finally {
            System.out.println("Finally ブロックが実行されました");
        }
    }
}