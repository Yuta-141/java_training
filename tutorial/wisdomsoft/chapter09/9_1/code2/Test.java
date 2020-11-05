class Test extends Thread{
    public static void main(String[] args){
        new Test("Blue Blue Glass Moon,", 500).start();
        new Test("\tUnder The Crimson Air.", 800).start();
    }
    private String str;
    private long interval = 10;
    public Test(String str, long interval){
        this.str = str;
        this.interval = interval;
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(str);
            try{
                Thread.sleep(interval);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }

        }
    }
}
