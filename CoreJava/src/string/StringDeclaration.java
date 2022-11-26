package string;

public class StringDeclaration 
{
	public static void main(String[] args) 
	{
		//declaring without using new keyword
		String s="String without new Keyword";
		System.out.println(s);
		System.out.println();
		
		//declaring by using new keyword
		String s1= new String("String with new keyword");
		System.out.println(s1);
		System.out.println();
		
		// string buffer
		StringBuffer buffer= new StringBuffer("String using String Buffer");
		System.out.println(buffer);
		buffer.append(" created by Rishikesh");
		System.out.println(buffer);
		System.out.println();
		
		// String Builder
		StringBuilder builder= new StringBuilder("String Builder");
		System.out.println(builder);
		builder.append(" created by Rishikesh");
		System.out.println(builder);
		
	}
}
