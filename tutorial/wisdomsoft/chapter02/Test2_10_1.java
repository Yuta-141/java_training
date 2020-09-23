class Test2_10_1{
    public static void main(String[] args){
        byte bValue = 10;
        char chValue = 'd';
        short sValue = 1000;

        int iValue = bValue;
        System.out.println(iValue);

        iValue = chValue;
        System.out.println(iValue);

        iValue = sValue;
        System.out.println(iValue);

        iValue = sValue;;
        System.out.println(iValue);
    }
}
