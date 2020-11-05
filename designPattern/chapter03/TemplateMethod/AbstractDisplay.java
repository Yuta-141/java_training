public abstract class AbstractDisplay{// 抽象クラスAbstractDisplay
    public abstract void open(); // サブクラスに実装を任せる抽象メソッド(1) open
    public abstract void print(); // サブクラスに実装を任せる抽象メソッド(2) print
    public abstract void close(); // サブクラスに実装を任せる抽象メソッド(3) close
    public final void display(){// この抽象クラスで実装しているメソッドdisplay
        open(); //まずopen
        for(int i=0; i<5; i++){ // 5 times print
            print();
        }
        close();  // finally close. これがdisplayメソッドで実装されている内容

    }
}
