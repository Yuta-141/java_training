class Test2_11_1{
    public static void main(String[] args){
        byte bValue = 2;
        bValue += 0xFF04;
        bValue += 8.0;
        bValue >>=  1;

        System.out.println(bValue);
    }
}
