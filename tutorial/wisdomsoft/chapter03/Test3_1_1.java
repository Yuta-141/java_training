class Test3_1_1{
    public static void main(String[] args){
        String str = 
                "10 == 100 =" + (10 == 100) + '\n' + 
                "'A' == 0x41 = " + ('A' == 0x41) + '\n' +
                "-0 == +0 = " + (-0 == +0) + '\n' + 
               "1000 < 500 = "+ (1000 < 500) + '\n' + 
                
                "1000 > 500 = "+ (1000 > 500) + '\n';
                System.out.println(str);
    }
}
