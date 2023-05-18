import java.util.*;
public class Ulam 
{
	public static int ulamRekursiv(int n)
	{
		return -1;
	
	}

	public static int ulamIterativ(int n)
	{
		return -1;
	}
	 
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Zahl n ein");
		int n = sc.nextInt();	
		System.out.println(ulamRekursiv(n));
		System.out.println(ulamIterativ(n));
	}

}
