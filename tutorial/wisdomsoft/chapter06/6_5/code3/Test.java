class Point{
    public final int x,y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}

class Test{
    public static void main(String[] args){
        System.out.println(new Point(400,300){
            public String toString(){
                return "{" + x + " , " + y + "}";
            }
        });
    }
}
