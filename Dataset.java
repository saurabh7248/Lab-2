import java.util.ArrayList;


public class Dataset
{
	public Dataset(String first, String last, String address, String city, String state, String phone, int zip,
			double donation) {
		super();
		this.first = first;
		this.last = last;
		this.address = address;
		this.city = city;
		this.state = state;
		this.phone = phone;
		this.zip = zip;
		this.donation = donation;
	}

	public Dataset() {
	}

	String first, last, address, city, state, phone;
	int zip;
	double donation;

	static ArrayList<Dataset> list = new ArrayList<Dataset>();

	public void addData(String f, String l, String a, String c, String s, String p, int z, double d)
	{
		list.add(new Dataset(f, l, a, c, s, p, z, d));
	}

}
