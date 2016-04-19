import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ArrayReader
{
	public static void main (String[] args) throws IOException
	{
		Scanner fileScan;
		File myFile = new File ("/home/saurabh/Programs/javahelp/Lab-2/Lab2.txt");
		fileScan = new Scanner(myFile);

		String person;
		Dataset dataset = new Dataset();

		while (fileScan.hasNext())
		{
			person = fileScan.nextLine();
			System.out.println(person);
			Scanner scan2 = new Scanner(person);
			scan2.useDelimiter("\t");

			int index = 0;
			Object[] fields = new Object[8];
			while (scan2.hasNext()){
				if (index == 5) {
					fields[index] = Integer.parseInt(scan2.next());
				}
				else if (index == 7) {
					fields[index] = Double.parseDouble(scan2.next());
				}
				else{
					fields[index] = scan2.next();
				}
				index++;
			}
			dataset.addData((String) fields[0], (String) fields[1], (String) fields[2], (String) fields[3],
					(String) fields[4], (String) fields[6], (int) fields[5], (double) fields[7]);
			scan2.close();
		}
		fileScan.close();
		System.out.println(dataset.list);
	}
}
