class HOGE{
    private int abc = 123;
    

    // public int Abc{
    //     get;
    //     set;
    // }
    public int get_abc(){
        return abc;
    }
}
class FOO{
    public static void main(String[] args) {
        //getter 
        HOGE hoge = new HOGE();
        int a = hoge.get_abc();
        System.out.println(a);
        
        // property
        // var hoge = new HOGE();
        // hoge.Abc = 123;
        // Console.WriteLine(hoge.Abc);
    }
}
