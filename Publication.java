/*
*
*	Name: Publication.java
*	Purpose: Represents the Basic form of a Publication Object
*
*/

public abstract class Publication
{
	
	//private fields
	private String title;
	private String publisher;
	private int numOfPages;
	private double price;
	
	/* Start of Accessors and Mutators */
	public void setTitle(String title)
	{
		
		this.title = title;
		
	}
	
	public String getTitle()
	{
		
		return this.title;
		
	}
	
	public void setPublisher(String publisher)
	{
		
		this.publisher = publisher;
		
	}
	
	public String getPublisher()
	{
		
		return this.publisher;
		
	}
	
	public void setNumOfPages(int numOfPages)
	{
		
		this.numOfPages = numOfPages;
		
	}
	
	public int getNumOfPages()
	{
		
		return this.numOfPages;
		
	}
	
	public void setPrice(double price)
	{
		
		this.price = price;
		
	}
	
	public double getPrice()
	{
		
		return this.price;
		
	}
	
	/* End of Accessors and Mutators */
	
	//@Override
	public String toString()
	{
		
		return String.format("%s %s %d %f", this.getTitle(), this.getPublisher(), this.getNumOfPages(), this.getPrice());
		
	}
	
	//@Override
	public boolean equals(Object o)
	{
		
		Publication obj = ((Publication) o);
		
		return this.title.equals(obj.title) && 
				this.publisher.equals(obj.publisher) && 
				this.numOfPages == obj.numOfPages;
		
	}
	
	//abstract method (prototype)
	public double salesValue(int numOfCopies);
	
}