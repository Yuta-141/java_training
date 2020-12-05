import java.io.*;

class Point implements Serializable{
	public final int x;
	public transient final int y;

	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return "X=" + x + ",Y=" + y;
	}
}

class Test{
	public static void main(String[]) throws Exception{
		File file = new File(args[0]);
	}
}
