
public class LearningJava {

	public static void main(String[] args) 
	{
		//variables
		int a =6;
		char b='o';
		long c = 231;
		double d = 3.2;
		String Fname = "Kevin";
		String FullName = AddLastName(Fname);
		JavaMethods M = new JavaMethods();
		boolean isItempty = M.isitempty(FullName);
		if(isItempty == false)
		{
			M.Welcome(FullName);
			M.DisplayArray();
		}
		else
		{
			System.out.println("Empty Name");
		}
	
	}
	public static String AddLastName(String n)
	{
		String Lname = n +" "+"Nguyen";
		return Lname;
	}

}
