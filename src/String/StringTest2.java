package String;

public class StringTest2 
{
 public static void main(String[] args) 
 {
	 
	 String str1 = "Hello";
	 String str2 = "Hello";
	 String str3 = new String("Hello");
	 // indentity checking
	System.out.println(str1==str2);
	System.out.println(str1==str3);
	System.out.println(str2==str3);  
	
	
	// data checking
	System.out.println(str1.equals(str2));
	System.out.println(str1.equals(str3));  // True 
	System.out.println(str2.equals(str3));  // True
}
 
 
}
