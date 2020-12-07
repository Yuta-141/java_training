class Test{
    static {
        System.loadLibrary("Test");
    }
    public native void nativeMethod();

    private final String name;
    public Test(String name){
        this.name = name;
    }
    public static void main(String[] args){
        new Test("Blue Blue Glass Moon,").nativeMethod();
        new Test("Under The Crimson Air.").nativeMethod();
    }

    public String toString() {
        return super.toString() + ",name=" + name;
    }
}