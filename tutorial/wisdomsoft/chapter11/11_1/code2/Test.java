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
	public static void main(String[] args) throws Exception{
		File file = new File(args[0]);
        if(file.exists()){
			FileInputStream fin = new FileInputStream(file);
			ObjectInputStream oin = new ObjectInputStream(fin);
			System.out.println(oin.readObject() + ":オブジェクトを読み込みました");
			oin.close();
			fin.close();

        }
        else {
            FileOutputStream fout = new FileOutputStream(file);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
			Point pt = new Point(400,300);
			oout.writeObject(pt);
			oout.close();
			fout.close();

			System.out.println(pt + ":オブジェクトを書き込みました" );
		}
	}
}
