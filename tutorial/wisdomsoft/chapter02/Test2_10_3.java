class Test2_10_3{
    public static void main(String[] args){
        int iValue = 0x00420041;

        String str = "(char)iValue = " +(char)iValue + '\n' + "(char)(iValue >> 16)" 
            + (char)(iValue >> 16);
        System.out.println(str);
        
    }
}
