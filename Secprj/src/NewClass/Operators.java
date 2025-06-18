package NewClass;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a =10;
        int b =2;
        int num1=8;
        
        int x=15;
        int y=12;
        
        System.out.println("add:"+(a+b));
        System.out.println("sub:"+(a-b));
        System.out.println("multi:"+(a*b));
        System.out.println("div:"+(a/b));
        System.out.println("Modulo:"+(a%b));
        
        // shift operation
        System.out.println("org:"+num1);
        System.out.println("left:"+(num1 << 2)); // << >> 8 2^2=4
        System.out.println("Signed:"+(num1 >> 2));
        System.out.println("org:"+(num1 >>>2)); // 
        
        // relational operation
        System.out.println("equal to:"+(a==b));
        System.out.println("greater than:"+(a>b));
        System.out.println("less than:"+(a<b));
        System.out.println("greater than equal to:"+(a>=b));
        System.out.println("less than equal to:"+(a<=b));
        System.out.println("not equal to:"+(a!=b));
        
        //Bitwise operation
       if(x>10 && y<30) {
    	   System.out.println("both are true");
    	   if(x>10 && y<30) {
    		   System.out.println("at least one");
    		   if(!(x<10))
    			   System.out.println("x is not less than 10"); }
    	   
    	   // ternary
    	   int age = 10;
    	   String voting = (age>=18) ? "you can vote" : "you can not vote";
    	   System.out.println(voting);  
    	   
    	   // assignment
    	   int abc =10;
    	   System.out.println("value:"+abc);
    	   
    	   abc+=3;
    	   System.out.println("value:"+abc);
    	   
    	   abc -=3;
    	   System.out.println("value:"+abc);
    	   
    	   abc *=2;
    	   System.out.println("value:"+abc);
    	   
    	   abc /=8;
    	   System.out.println("value:"+abc);
    	   
    	   abc %=9;
    	   System.out.println("value:"+abc);
    	   
       }
        
	}

}
