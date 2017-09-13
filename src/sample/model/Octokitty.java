package sample.model;

public class Octokitty 
{
private int cuteness;
	
	public Octokitty()
	{
		this.cuteness = 5;
	}
	
	public Octokitty(int size)
	{
		this.cuteness = size;
	}
	
	public String toString()
	{
		String description = "I am a cute octokitty and my cuteness is " + size;
		return description;
	}
}
	

