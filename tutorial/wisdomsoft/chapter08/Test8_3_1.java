class Test8_3_1{
    public static void main(String[] args) {
        try {
            throw new Exception("例外のメッセージ");
        }
        catch (Exception err){
            System.out.println(err);
        }
    }
}