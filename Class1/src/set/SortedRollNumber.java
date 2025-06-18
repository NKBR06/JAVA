package set;

import java.util.*;


public class SortedRollNumber {
	public static void main(String[] args) {
		SortedSet<Integer> rollnumber = new TreeSet<>();
		rollnumber.add(105);
		rollnumber.add(101);
		rollnumber.add(103);
		
		System.out.println("Sorted rollnumber:"+ rollnumber);
		
		}
	}