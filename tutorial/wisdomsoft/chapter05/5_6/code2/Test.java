class Point {
    public final int x, y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}

class Test{
    public static void main(String[] args){
        Point pt = new Point(400,300);

       // pt.x = 100;
        System.out.println("X = " + pt.x + ": Y = " + pt.y);
    }
}
