
public class Fruits {
	protected String Name;
	protected String Taste;
	protected int Size;
	
	public Fruits()
	{
		Name = "Apple";
		Taste = "Sweet";
		Size = 0;
	}
	public void eat()
	{
		System.out.println(Name + " tastes "+ Taste);
	}
}
