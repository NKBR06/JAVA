package Hashtable;
import java.util.Hashtable;
public class HashTableEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Hashtable<String,String> login = new Hashtable<>();
        login.put("admin","1234");
        login.put("user", "abcd");
        System.out.println("Admin password:"+login.get("admin"));
        }

}
