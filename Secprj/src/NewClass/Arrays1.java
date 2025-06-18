package NewClass;

import java.util.Arrays;
public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] num= {1,2,3,4,5,6};
       
       String[] fruits= {"apple","mango","banana","grape"};
       System.out.println("need to print banana: "+fruits[2]);
       System.out.println("need to print4: "+num[3]);
       
       // shopping car
       
       double[] productPrice= {100,20,20.2,30.5,55.6};
       double totalPrice = productPrice[0]+productPrice[1]+productPrice[2];
        System.out.println("Total Price= "+totalPrice);
        
        // student marks
        
        int[] marks = {85,95,100,52,78};
        int totalMarks = marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
        int avgmarks = totalMarks/5;
        System.out.println("Total marks: "+totalMarks);
        System.out.println("Average marks: "+avgmarks);
        
       //2D Array
        int [][] matrix = {
        		{1,2,3},
        		{4,5,6},
        		{7,8,9}};
        System.out.println(matrix[0][0]+" "+matrix[0][1]+" "+matrix[0][2]);
        System.out.println(matrix[1][0]+" "+matrix[1][1]+" "+matrix[1][2]);
        System.out.println(matrix[2][0]+" "+matrix[2][1]+" "+matrix[2][2]);
        
	// ticket booking - bookmyshow
	String [][] seats = {
			{"Available", "Booked","Available"},
			{"Booked","Booked","Available"},
			{"Available","Booked","Booked"},
	};
	
	System.out.println(seats[0][0]);
	System.out.println(seats[1][1]);
	
	// clone array
	
	int[] orgArray = {10,20,30,40,50};
	int[] cloneArray = orgArray.clone();
	cloneArray[0]=99;
	
	System.out.println("org: "+Arrays.toString (orgArray));
	System.out.println("clone: "+Arrays.toString (cloneArray));
	}
}
