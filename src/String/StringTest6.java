package String;

public class StringTest6 {
public static void main(String[] args) {
	
	String str = " Hii mango is GOOD APPLE IS great orange is fruit";
	
	
	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());
	
	
	// String is immutable : modification not possible 
	String str1 = " ratan";   
	str1.concat(" soft");
	System.out.println(str1);
	
	
	// Stringbuffer is mutable : it is allows modification s
	StringBuffer sb = new StringBuffer(" durga");
	sb.append("soft");
	System.out.println(sb);
}
}
