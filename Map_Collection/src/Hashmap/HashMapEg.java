package Hashmap;
import java.util.HashMap;
public class HashMapEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String,Integer> marks = new HashMap<>();
        marks.put("abc",85);
        marks.put("pqr",99);
        marks.put("xyz",78);
        System.out.println("abc's marks:"+marks.get("abc"));
	}

}
