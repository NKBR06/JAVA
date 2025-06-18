package NewClass;

import java.util.*;
import java.util.Scanner;

public class string1 {

	public static void main(String[] args) {
		// Concatenation user register system
       Scanner obj = new Scanner(System.in);
       
       System.out.println("enter the first name");
       String firstname = obj.nextLine();
       
       System.out.println("enter the second name");
       String secondname = obj.nextLine();
       
       System.out.println("enter the email");
       String email = obj.nextLine();
       
       String Welcome1 = "Welcome,"+firstname+" "+secondname+" your email"+email;
       
       String Welcome2 = "Welcome,".concat(firstname).concat(" ").concat(secondname).concat("your email is ".concat(email));
       
       System.out.println(Welcome2);
	}

}
