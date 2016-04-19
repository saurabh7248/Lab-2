import java.awt.*;
import java.io.*;
import java.util.*;

public class ArrayReader
{
	public static void main (String[] args) throws IOException
	{
		Scanner fileScan;
		File myFile = new File ("Lab2.txt");
		fileScan = new Scanner(myFile);

		String person;

		while (fileScan.hasNext())
		{
			person = fileScan.nextLine();
			System.out.println(person);
			Scanner scan2 = new Scanner(person);
			scan2.useDelimiter("\\t");

			while (scan2.hasNext())
				System.out.println("  " +scan2.next());

				System.out.println();
		}
	}
}
