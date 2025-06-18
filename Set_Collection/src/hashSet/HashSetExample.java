package hashSet;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> ids = new HashSet<>();
		ids.add("E101");
		ids.add("E102");
		ids.add("E101");
		System.out.println("Employee ids:"+ids);
	}

}
