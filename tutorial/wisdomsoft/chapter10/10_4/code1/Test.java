import java.io.*;

public class Test{
	public static void main(String[] args) throws Exception{
		File file = new File(args[0]);
		String strInfo = "絶対パス=" + file.getAbsolutePath() + "\n" + 
		"正規パス=" + file.getCanonicalPath() + "\n" + 
		"サイズ=" + file.length() + "\n" + 
		"読み込み" + (file.canRead() ? "可能" : "不可能") + "\n" + 
		"書き込み" + (file.canWrite() ? "可能" : "不可能") + "\n" + 
		"パスはディレクトリ" + (file.isDirectory() ? "である" : "でない") + "\n" + 
		"パスはファイル" + (file.isFile() ? "である" : "でない") + "\n" + 
		"パスの実態は" + (file.exists() ? "存在する" : "存在しない");
		
		System.out.println(strInfo);
	}
}
