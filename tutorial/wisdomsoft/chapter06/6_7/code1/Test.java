class Test{
    private interface IVisibility{
      void show();
    }
    private class Child implements IVisibility{
        public void show() {
            System.out.println(toString() + ".show");
        }
    }

    public static void main(String[] args){
        IVisibility obj = new Test() . new Child();
        obj.show();
    }
}
    
