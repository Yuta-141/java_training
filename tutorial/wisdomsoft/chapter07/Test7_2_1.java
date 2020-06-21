class Test7_2_1{
    public static void main(String[] args) {
        char cKitty[] = new char[5];
        cKitty[0] = 'K';
        cKitty[1] = 'i';
        cKitty[2] = cKitty[3] = 't';
        cKitty[4] = 'y';
 
        String strKitty = new String(cKitty); //char[5]の配列をStringに変換
        System.out.println(strKitty);
    }
}