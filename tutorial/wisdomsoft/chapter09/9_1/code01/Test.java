class Test extends Thread{
    public static void main(String[] args){
        new Test().start();
        for(int i=0;i<5;i++)
            System.out.println("Blue Blue Glass Moon, ");
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Under The Crimson Air.");
        }
    }
}
