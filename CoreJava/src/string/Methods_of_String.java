package string;

public class Methods_of_String 
{
	public static void main(String[] args) 
	{
		String name= "Rishikesh";
		String lastname= " Patole ";
		String name1=name;
		
		//String.length() : int
		System.out.println("length of string// name.length() = "+name.length());
		System.out.println();
		
		//String.charAt(index): char
		char c=name.charAt(5);
		System.out.println("name.charAt(5) = "+c);
		System.out.println();
		
		//String.concat(String) : String
		String Fullname=name.concat(lastname);
		System.out.println("name.concat(lastname) = "+Fullname);
		System.out.println();
		
		//String.contains(CharSequence s) : boolean
		boolean b  = Fullname.contains(lastname);
		System.out.println("(Fullname.contains(lastname)) = "+b);
		System.out.println();
		
		//String.contentEquals(CharSequence s): boolean
		boolean b1=name.contentEquals(Fullname);
		System.out.println("name.contentEquals(Fullname) = "+b1);
		System.out.println("name.contentEquals(name1) = "+name.contentEquals(name1));
		System.out.println();
		
		//Strinig.endWith(String ): boolean
		boolean b2=name.endsWith("sh");
		System.out.println("name.endsWith(String):boolean= "+b2);
		System.out.println();
		
		//String.equalsIgnoreCase(String): boolean
		boolean b3 = name.equalsIgnoreCase(name1);
		System.out.println("name.equalsIgnoreCase(name1)= "+b3);
		System.out.println();
		
		//String.indexOf(char) : integer
		int ind = name.indexOf('k');
		System.out.println("name.indexOf('k')= "+ind);
		System.out.println();
		
		// String.isBlank() : Boolean 
		boolean b4=name.isBlank();
		System.out.println("name.isBlank() = "+b4);
		System.out.println();
	
		// String.isEmpty() : Boolean 
		boolean b5=name.isEmpty();
		System.out.println("name.isEmpty() = "+b5);
		System.out.println();
		
		//String.lastIndexOf(c) : int
		int lastind=name.lastIndexOf('i');
		System.out.println("name.lastIndexOf(i) = "+lastind);
		System.out.println();
		
		//String.replace(char old, char new) : String
		String s3=name.replace('R','r');
		System.out.println("name.replace('R','r')= "+s3);
		System.out.println();
		
		//String.replace(CharSequence target, CharSequence replacement)
		//String.replaceAll(String regex, String replacement)
		//String.replaceFirst(String regex, String replacement)
		
		//String.split(String regex) : String []
		String a[]= name.split("");
		System.out.println(a.length);
		System.out.println();
		
		//String.split(String regex, int limit)
	
		//String.startsWith(String prefix)
		boolean b6 =name.startsWith("Ri");
		System.out.println("name.startsWith(String Prefix) = "+b6);
		System.out.println();
		
		//String.strip() : String
		lastname.strip();
		System.out.println("lastname.strip() = "+lastname.strip());
		System.out.println();
		
		//String.substring(int beginindex) : String
		String n = name.substring(3);
		System.out.println("name.substring(3)= "+n);
		System.out.println();
	
		//String.substring(int beginIndex, int endIndex) 
		String n1=name.substring(3, 7);
		System.out.println("name.substring(3, 7) = "+n1);
		System.out.println();
		
		//String.toCharArray() : char []
		char c1[]=name.toCharArray();
		System.out.println("length of char array : "+c1.length);
		System.out.println();
		
		
		//String.toLowerCase() : String
		String n2=name.toLowerCase();
		System.out.println("name.toLowerCase() = "+n2);
		System.out.println();
		
		//String.toUpperCase() : String
		String n3 = name.toUpperCase();
		System.out.println("name.toUpperCase() = "+n3);
		System.out.println();
		
	}
	

}
