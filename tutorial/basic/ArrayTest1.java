import java.util.Arrays;
import java.util.List;

public class ArrayTest1{
    public static void main(String[] args){
        String[] a = {"Google", "Apple", "Microsoft"};
        
        if(Arrays.asList(a).contains("Apple")){
            System.out.println("Apple - Found!");
        }
        else {
            System.out.println("Apple - Not Found!");
        }
    }
}