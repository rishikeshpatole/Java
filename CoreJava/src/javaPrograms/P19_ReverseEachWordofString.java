package javaPrograms;

public class P19_ReverseEachWordofString {

	public static void main(String[] args) {
		
		String s="Rishikesh Patole";
		
		String words[]=s.split(" ");
		String reversedString= "";
		
		for(int i=0;i<words.length;i++)
		{
			String word= words[i];
			String reverseWord="";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseWord=reverseWord+word.charAt(j);
			}
			System.out.println(reverseWord);
			reversedString=reversedString+reverseWord+" ";
		}
		System.out.println(reversedString);
	}

}
