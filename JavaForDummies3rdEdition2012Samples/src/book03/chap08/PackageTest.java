package book03.chap08;

import com.lowewriter.util.Console;

public class PackageTest
{
	public static void main(String[] args)
	{
		while (Console.askYorN("Keep going?"))
		{
			System.out.println("D'oh!");
		}
	}
}