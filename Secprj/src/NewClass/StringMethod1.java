package NewClass;

import java.net.MulticastSocket;

public class StringMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str = "Java Programming";
       String str2 = "Java Programming";
       String emptystr = "";
       String blankstr = " ";
       System.out.println("Length of str"+str.length());
       
       char[] chars = str.toCharArray();
       System.out.println("character in str: ");
       for (char c: chars) {
    	   System.out.print(c + " " );
       }
       System.out.println();
       
       int comparison = str.trim().compareTo(str2);
       System.out.println("Comparison result: "+comparison);
       
       System.out.println("is emptyStr empty?"+ emptystr.isEmpty());
  
       System.out.println("character at index2"+ str.charAt(2));
       
       System.out.println("Starts with ' Ja'? "+ str.startsWith(" Ja"));
       System.out.println("Ends with 'ing '"+ str.endsWith("ing "));
       
       System.out.println("Lowercase: "+ str.toLowerCase());
       
       System.out.println("Uppercse"+ str.toUpperCase());
       
       System.out.println("Trimmed str: "+ str.toUpperCase());
       
       System.out.println("Stripped str: "+ str.trim()+" ' ");
       
       System.out.println("Leading stripped str"+ str.strip()+ "'");
       
       System.out.println("Trailing stripped str"+ str.stripTrailing()+"'");
       
       String repeated = "Java".repeat(3);
       System.out.println("Repeated string"+ repeated);
       
       boolean contentEqual = str.trim().contentEquals(str2);
       System.out.println("Content equals?"+ contentEqual);
       
       
       }
    		   }

