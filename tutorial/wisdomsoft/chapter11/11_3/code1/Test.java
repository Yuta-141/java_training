class Test{
    public static final float f = 0.3F * 10F; //FP-strict
    public strictfp static void main(String[] args){
        double d = 1.7E+308;
        System.out.println(d * f * 0.1);
        System.out.println(d * 0.1 * f);
    }

}