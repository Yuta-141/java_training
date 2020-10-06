class Point{
    public final int x,y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof Point)){
            System.out.println(toString() + "not" + obj.toString());
            return false;
        }

        Point pt = (Point) obj;
        System.out.println(pt.x + " = " + this.x + " & " + pt.y + " = " + this.y);
        return ((pt.x == this.x) && (pt.y == this.y));

    }
}

class Test{
    public static void main(String[] args){
        Object obj = new Point(400,300);
        System.out.println(obj.equals(new Point(300,300)) + "\n");
        System.out.println(obj.equals(new Test()) + "\n");
        System.out.println(obj.equals(new Point(300,300)));
    }
}
