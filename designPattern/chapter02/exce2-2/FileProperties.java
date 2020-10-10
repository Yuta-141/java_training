import java.util.Properties;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

class FileProperties extends Properties implements FileIO{
    private Properties fileProperties = new Properties();
    public void readFromFile(String filename) { 
		try{
			InputStream readFile = new FileInputStream(filename);
        	fileProperties.load(readFile);
		}
		catch(Exception e){
			e.printStackTrace();
		}
    }

    public void writeToFile(String filename){
		try{
			OutputStream out = new FileOutputStream(filename);
       		store(out,this.fileProperties.toString());
		} catch(Exception e){
			e.printStackTrace();
		}
    }
    public void setValue(String key,String value){
//        this.fileProperties = key + "=" + value;
        this.fileProperties.setProperty(key,value);
    }
    public String getValue(String key){
        return fileProperties.getProperty(key);
    }
     

} 
