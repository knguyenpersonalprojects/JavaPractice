import java.util.ArrayList;

public class JavaMethods 
{
	public static void Welcome(String N)
	{
		System.out.println("Welcome"+" "+N);
	}
	public static void DisplayArray()
	{
		ArrayList<Integer>a = new ArrayList<Integer>();
		for(int i = 0; i < 5; i ++)
		{
			a.add(i);
		}
		for(int index : a)
		{
			System.out.println(index);
		}
		
	}
	public static boolean isitempty(String n) 
	{
		if(n.isEmpty())
		{
			return true;
		}
		else
			return false;
	
	}
}
