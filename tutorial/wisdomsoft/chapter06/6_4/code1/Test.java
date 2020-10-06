class Test{
    private String str = "";
    public static void main(String[] args){
        Test obj = new Test();
        obj.str = "Kitty on your lap";
        System.out.println(obj.getLocal());
    }

    public Object getLocal(){
        class Local {
            public String toString(){
                return super.toString() + ":" + str;
            }
        }
        return new Local();
    }
}
