import java.util.*; 
import java.util.stream.IntStream; 

public class AverageofIntegers {
	 public static void main(String[] args) 
	    {
	        IntStream stream = IntStream.of(7, 2, 3, 12, 34, 8); 
	        OptionalDouble objj1 = stream.average(); 
	        if (objj1.isPresent()) { 
	            System.out.println(objj1.getAsDouble()); 
	        } 
	        else { 
	            System.out.println("-1"); 
	        } 
	    } 

}