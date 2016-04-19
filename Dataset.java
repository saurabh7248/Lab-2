import java.awt.*;
import java.io.*;
import java.util.*;


public class Dataset
{
	String first, last, address, city, state, phone;
	int zip;
	double donation;


	public void addData(String f, String l, String a, String c, String s, String p, int z, double d)
	{

		first = f;
		last = l;
		address = a;
		city = c;
		state = s;
		phone = p;
		zip = z;
		donation = d;
	}

}
