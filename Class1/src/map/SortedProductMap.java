package map;
import java.util.*;
public class SortedProductMap {

		public static void main(String[] args) {
			SortedMap<Integer,String> productMap = new TreeMap<>();
			productMap.put(200,"Mouse");
			productMap.put(100,"Keyword");
			productMap.put(300,"Monitor");
			
			System.out.println("Sorted Product map:"+ productMap);
			
			}
		}