//  インスタンスの生成

class Score{
    public int math;
    public int english;

    public Score(){//コンストラクタ
        System.out.println("引数なしコンストラクタ実行");
    }
    public double average(){
        return (math + english) / 2.0;
    }
    public void set_math(int s){
        math = s;
    }
}
class OLtest{
    public void show(){
        System.out.println("引数なし");
    }
    public void show(String a){
        System.out.println("引数は文字クラス；" + a);
    }
    public void show(int a){
        System.out.println("引数は整数class:" + a);
    }
    public void show(int a,int b){
        System.out.println("引数は整数クラスx2:" + a + "-" + b);
    }
}
// 4複数インスタンスの生成
class Main{
    public static void main(String[] args){
        // Score sc_taro = new Score(); 
        // sc_taro.math = 5;
        // sc_taro.english = 3;
    
        // Score sc_hanako = new Score();
        // sc_hanako.math = 80;
        // sc_hanako.english = 70;

        // System.out.println("太郎：math = " + sc_taro.math + "english = " + sc_taro.english +"ave =" +sc_taro.average());
        // System.out.println("花子：math = " + sc_hanako.math + "english = " + sc_hanako.english + "ave =" + sc_hanako.average());
   
        // sc_taro.set_math(20);
        // System.out.println("太郎：math = " + sc_taro.math + "english = " + sc_taro.english +"ave =" +sc_taro.average());
        // System.out.println("花子：math = " + sc_hanako.math + "english = " + sc_hanako.english + "ave =" + sc_hanako.average());
        
        OLtest ol =  new OLtest();
        ol.show();
        ol.show("ほげ");
        ol.show(123);
        ol.show(123,456);
    }

}