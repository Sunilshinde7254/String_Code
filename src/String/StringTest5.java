package String;

import java.util.Scanner;
import java.util.*;
public class StringTest5 
{
public static void main(String[] args) 
{
	System.out.println("Enter the name ");
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
  
	String vowels = extractVowels(name);
    String consonants = extractConsonants(name);

    // Print the results
    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
    sc.close();
}

    private static String extractVowels(String input) 
    {
        // Regular expression to match vowels
    	Set<Character> vowels = new HashSet<>();
        for (char ch : input.toLowerCase().toCharArray()) 
        {
            if ("aeiou".indexOf(ch) != -1) 
            {
                vowels.add(ch);
            }
        }
        return input.replaceAll("[^aeiouAEIOU]", "");
       

    }

    private static String extractConsonants(String input) {
        // Regular expression to match consonants
    	Set<Character> consonants = new HashSet<>();
        for (char ch : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) == -1 && Character.isLetter(ch)) {
                consonants.add(ch);
            }
        }
        return input.replaceAll("[aeiouAEIOU]", "");



	
}
}
