class Test extends Thread{
    public static void main(String[] args){
        new Test("Sub Thread1").start();
        new Test("Sub Thread2").start();

        currentThread().setName("Main Thread");
        syncMethod();
    }
    public Test(String name){
        super(name);
    }
    public void run(){
        System.out.println("Call SyncMethod : " + getName());
        syncMethod();
    }
    synchronized private static void syncMethod(){
        System.out.println("SyncMethod : " + currentThread().getName());
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
    
}
