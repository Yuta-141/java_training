import jdk.nashorn.internal.ir.CatchNode;

class Test8_2_2{
    public static void main(String[] args) {
        try{
            if(args[0].equals("/n")){
                String str = null;
                int i = str.length();
            } else if(args[0].equals("/c")){
                Test8_2_2 obj = (Test8_2_2) ((Object)args);
            } else if(args[0].equals("/z")){
                int i = 10/  0;
            }
            System.out.println("正常にtry");
        }
        catch (ArithmeticException err){
            System.out.println("不正な算術演算です");
     
        }
        catch (ArrayIndexOutOfBoundsException err){
            System.out.println("配列に不正なインデックスでアクセスしました");
        }
        catch (NullPointerException err){
            System.out.println("nullを参照しました");
        }
        catch (ClassCastException err){
            System.out.println("不正なクラスのキャストです");
        }
    }
}