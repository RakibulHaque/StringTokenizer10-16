import java.util.StringTokenizer;

public class Tokenizer {
	
	public static void main(String[] args)
	{
		System.out.println("Using constructor 1:");
		
		StringTokenizer st1 = new StringTokenizer("Hello everyone how are you"," ");
		
		while(st1.hasMoreTokens())
		{
			System.out.println(st1.nextToken());
		}
	}

}
