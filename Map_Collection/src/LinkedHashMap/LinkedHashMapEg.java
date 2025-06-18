package LinkedHashMap;
import java.util.LinkedHashMap;
public class LinkedHashMapEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedHashMap<String,String> cities = new LinkedHashMap<>();
        cities.put("India","Delhi");
        cities.put("USA","Washington");
        cities.put("Uk","London");
        System.out.println("All Entries:"+cities);
        }

}
