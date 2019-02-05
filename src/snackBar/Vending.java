package snackBar;

public class Vending
{
	private static int maxID = 0;
	public int id;
	public String name;

	public Vending (String name)
	{
		maxID++;
		id = maxID;
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
