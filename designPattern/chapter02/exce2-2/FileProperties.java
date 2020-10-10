import java.util.Properties;

class FileProperties extends Properties{
    private Properties fileProperties = new Properties();
    public void readFromFile(String filename) { 
        load(filename);
    }
    public void writeToFile(String filename){
        store(out,header,this.fileProperties);
    }
    public void setValue(String key,String value){
//        this.fileProperties = key + "=" + value;
        this.fileProperties.setProperty(key,value);
    }
    public String getValue(String key){
        return getProperty(key);
    }
     

} 
