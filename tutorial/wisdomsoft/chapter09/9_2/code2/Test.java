class SyncTest{
    public void show(){
        System.out.println("Show : " + Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

class Test extends Thread{
    private static SyncTest obj = new SyncTest();

    public static void main(String[] args){
        new Test("Sub Thread1").start();
        new Test("Sub Thread2").start();
        new Test("Sub Thread3").start();
    }
    public Test(String name){
        super(name);
    }
    public void run(){
        System.out.println("Call : " + getName());
        synchronized(obj){
            obj.show();
        }
    }
}

