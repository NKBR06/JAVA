package map;


import java.util.*;



public class StudentMap {
	public static void main(String[] args) {
		Map<Integer,String> studentMap = new HashMap<>();
		studentMap.put(101,"Amit");
		studentMap.put(102,"Neha");
		studentMap.put(103,"Ravi");
		
		System.out.println("Student Map:"+ studentMap);
		
		}
	}
