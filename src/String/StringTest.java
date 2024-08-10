package String;

public class StringTest 
{

	public static void main(String[] args) {
		
		String str = " Ratan";
		System.out.println(str);
		
		String str1 = new String(" Ratan");
		System.out.println(str1);
		
		// conversion of char [] to string format
		
		char[]ch = {'r' , 'a', 't','n'};
		String str3 = new String(ch);
		System.out.println(str3);
		
		char[]ch1 = {'r' , 'a', 't','n'};
		String str4 = new String(ch1,2,2);
		System.out.println(str4);
//		
//		
//		// conversion of byte to string format
//		
		byte [] b = {65,66,67,68,69};
		String str5 = new String(b);
		System.out.println(str5);
//		
//
		byte [] b1 = {65,66,67,68,69};
		String str6 = new String(b1,3,2);
		System.out.println(str6);
//		
	}
}
