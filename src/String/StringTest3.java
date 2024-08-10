package String;

public class StringTest3 
{

	public static void main(String[] args) {
		
		String str1 = " ratan";
		String str2 = " durga";
		String str3 = " ramu";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));
		System.out.println("ratan".equals("RATAN"));
		System.out.println("ratan".equalsIgnoreCase("RATAN"));
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str2.compareTo(str1));
		
		System.out.println("ratan".compareTo("ratan"));
		System.out.println("ratan".compareTo("RATAN"));
		System.out.println("ratan".compareToIgnoreCase("RATAN"));
		
		System.out.println("anu".compareTo("anutnrt"));
		System.out.println("anuratr".compareTo("anu"));
	}
}
