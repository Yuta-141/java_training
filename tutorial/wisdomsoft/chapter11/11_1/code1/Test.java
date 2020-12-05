import java.io.*;

class Point implements Serializable{
	public final int x,y;
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return "X=" + x +  ", Y=" + y;
	}
}

class Test{
	public static void main(String[] args) throws Exception{
		File file = new File(args[0]);
		if(file.exists()){
			FileInputStream fin = new FileInputStream(file);
			ObjectInputStream oin = new ObjectInputStream(fin);
			Point pt = (Point)oin.readObject();
			oin.close();
			fin.close();

			System.out.println(pt + ": read objects");
		}
		else {
			FileOutputStream fout = new FileOutputStream(file);
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			Point pt = new Point(400,300);
			oout.writeObject(pt);
			oout.close();
			fout.close();

			System.out.println(pt + "Object writen");
		}
	}
}
