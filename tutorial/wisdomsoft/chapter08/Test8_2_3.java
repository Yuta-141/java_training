class Test8_2_3{
    public static void main(String[] args) {
        try {
            if(args[0].equals("/n")){
                String str = null;
                int i = str.length();
            }
            else if(args[0].equals("/c")){
                Test8_2_3 obj = (Test8_2_3) ((Object) args);
            }
            else if(args[0].equals("/z")){
                int i = 10 / 0;
            }
            System.out.println("正常に try　ブロックを終了します"); 
        }
        catch (Exception err){
            System.out.println("例外が発生しました：" + err.toString());
        }
    }
    
}