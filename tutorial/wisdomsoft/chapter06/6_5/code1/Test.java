class Test{
    public static void main(String[] args){
        System.out.println(new Object(){
            public String toString(){
                return "Kitty on your lap";
            }
        });
    }
}
