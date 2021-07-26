package pac.javaprograms.assignment;

public class ReverseStringWithRecursion {

	public String reverseString(String word)
	{
		if(word.isEmpty())
		{
		   System.out.println("The string is empty");
		   return word;
		   
		}
		else
		{
			return reverseString(word.substring(1))+word.charAt(0);  
		}
	}
	
	public static void main(String[] args) {
		
		ReverseStringWithRecursion rs=new ReverseStringWithRecursion();
		String result = rs.reverseString("computer");
		
		System.out.println(result);

	}

}
