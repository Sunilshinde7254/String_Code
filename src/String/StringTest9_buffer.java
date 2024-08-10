package String;

public class StringTest9_buffer 
{
public static void main(String[] args) 
{
	// String is immutable : modification not possible 
		String str1 = " ratan";   
		str1.concat(" soft");             // modification not allowed
		System.out.println(str1);
		
		// using 3rd varible 
		String str11 = " ratan";   
		String res =str11.concat(" soft");             // modification not allowed
		System.out.println(res);
		
		//Note : Initilay str is pointing to "ratan" later it is reassigned to "ratansoft" so ratan object is garabage collected.
		String str2 = " ratan";   
		str2=str2.concat(" soft");             // modification not allowed
		System.out.println(str2);
		
		
		// Stringbuffer is mutable : it is allows modification s
		StringBuffer sb = new StringBuffer(" durga");
		sb.append("soft");               // modification allowed
		System.out.println(sb); 
}
}
