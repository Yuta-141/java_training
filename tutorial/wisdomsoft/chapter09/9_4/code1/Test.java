class WaitTest{
    public synchronized void stop(){
        System.out.println(Thread.currentThread().getName() + ": wait");
        try{
            wait();
        }
        catch(InterruptedException e){
            System.out.println(Thread.currentThread().getName() + ": restart ");
        }
    }
    public synchronized void restart(){
        System.out.println(Thread.currentThread().getName() + ": notice restart");
        notify();
    }
}

class Test{
    public static WaitTest obj = new WaitTest();
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<5;i++){
            Thread stopThread = new Thread(){
                public void run(){
                    obj.stop();
                }
            };
            stopThread.start();
        }
        for(int i=0;i<5;i++){
            Thread.sleep(1000);
            obj.restart();
        }
    }
}
