 package String;

public class StringTest1 
{
	public StringTest1 (String string)
	{
		
	}
public static void main(String[] args) 
{
	StringTest1 t1 = new StringTest1("Sunil");
	StringTest1 t2 = new StringTest1("Sunil");
	
	System.out.println(t1.equals(t2)); // reference compare
	System.out.println(t1==t2);        // Reference Compare
	
	String str1 = "anu";
	String str2 = "anu";
	
	System.out.println(str1.equals(str2));  // content compare
	System.out.println(str1 == str2);       // Reference compare
	
	String s1 = new String("Anil");
	String s2 = new String("Anil");
	System.out.println(s1.equals(s2));
	System.out.println(s1==s2);
	
	StringBuffer sb1 = new StringBuffer("Naresh");
	StringBuffer sb2 = new StringBuffer("Naresh");
    System.out.println(sb1.equals(sb2));   // object class reference compare
    System.out.println(sb1==sb2);
	
}
}
