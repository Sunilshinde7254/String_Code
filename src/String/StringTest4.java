package String;

public class StringTest4 
{
  public static void main(String[] args) {
	String s1 = "   Ratan    ";
	System.out.println(s1);
	System.out.println(s1.trim());
	System.out.println(s1.length());
	System.out.println(s1.trim().length());
	
	//charAt
	String s2 = "Ratan";
	System.out.println(s2);
	System.out.println(s2.charAt(2));
	System.out.println(s1.charAt(1));
	try
	{
		System.out.println(s2.charAt(12));
	}
	catch (Exception e) 
	{
		System.out.println(" Exception");
	}
	System.out.println(s2.indexOf('a'));
	System.out.println(s2.lastIndexOf('a'));
	
	// length varaible vs length ()
	int [] a = {12,23,45};
	System.out.println(a.length);
	System.out.println("ratan".length());;
	
	String s3 = "hi sir how r u";
	System.out.println(s3.endsWith("u"));
	System.out.println(s3.endsWith("how"));
	System.out.println(s3.startsWith("hi"));
	System.out.println(s3.startsWith("r"));
	
	String s4 = "Hi ratan how are you ";
	String[]s = s4.split(" ");
	for(String ss:s)
	{
		System.out.println(ss);
	}
	 
	String s5 = "hii ratan HII ANU ";
	System.out.println(s5.toUpperCase());
	System.out.println(s5.toLowerCase());
	
	String s6 = "hii ratan anu";
	System.out.println(s6.contains("ratan"));
	System.out.println(s6.contains("Anil"));
	
	String s7 = "hi ratan anu";
	System.out.println(s7.replace('a', 'A'));
	System.out.println(s7.replace("ratan", "naresh"));
	System.out.println(s7.replace("anu", "ramu"));
	System.out.println(s7.replace(" ", ""));
	
	String s8 = "sunilShinde";
	System.out.println(s8.substring(3));
	System.out.println(s8.substring(2,6));
	
	int [] arr = {2,5,7};
	System.out.println(arr.length);
	System.out.println("ratan".length());
		
	
	
}
}
