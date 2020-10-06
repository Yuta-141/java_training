class Point{
    public final int x,y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "X = " + this.x + ": Y = " + this.y;
    }
}

class Test{
    public static void main(String[] args){
        Point pt = new Point(400,300);
        System.out.println(pt);
    }
}
