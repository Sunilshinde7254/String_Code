package String;

public class StringTest8_Stringbuffer 
{
	public static void main(String[] args) 
	{
      StringBuffer sb1 = new StringBuffer("Sunilshinde");
      System.out.println(sb1.delete(2, 5));
      System.out.println(sb1.deleteCharAt(3));
      
      StringBuffer sb2 = new StringBuffer("Anilsunil");
      System.out.println(sb2.reverse());
      
      StringBuffer sb3 = new StringBuffer("Sunil");
      System.out.println(sb3.insert(0, "Hii "));
      
      StringBuffer sb4 = new StringBuffer("Hii Anil shinde");
      System.out.println(sb4.replace(2, 4, "Sunil "));
      
     StringBuffer sb5 = new StringBuffer("Sunil");
      sb5.append(" Shinde");
      System.out.println(sb5);
	}
}
