
import java.util.*;
public class Anagram {
	static boolean anagram(char a1[],char a2[])
	{
		if(a1.length != a2.length)
			return false;
		Arrays.sort(a1);
		Arrays.sort(a2);
		for(int i=0;i<a1.length;i++)
			if(a1[i] != a2[i])
				return false;
		return true;		
	}
	public static void main(String[] args) {
		char a1[]= {'I','N','E','U','R','O','N'};
		char a2[]= {'R','E','U','N','I','O','N'};
		if(anagram(a1,a2))
			System.out.println("Anagram");
		else
			System.out.println("Not a Anagram");
	}

}