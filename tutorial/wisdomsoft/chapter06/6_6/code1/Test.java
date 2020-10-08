class Parent{
    public static class Child{
       public static String str = "Kitty on your lap";
        public String toString(){
            return super.toString() + " : " + str;
        }
    }
}

class Test{
    public static void main(String[] args){
        Parent.Child obj = new Parent.Child();
        System.out.println(obj);
    }
}

        
