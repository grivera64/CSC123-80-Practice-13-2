/*
	
	
	
*/ 

public class ChildBook extends Book
{
	
	private int minAge;
	private int maxAge;
	
	public ChildBook()
	{
		
		
		
	}
	
	public ChildBook(String title, String publisher, int numOfPages,
					double price, String author, int minAge, int maxAge)
	{
		
		this.setTitle(title);
		this.setPublisher(publisher);
		this.setNumOfPages(numOfPages);
		this.setPrice(price);
		this.setAuthor(author);
		this.setMinAge(minAge);
		this.setMaxAge(maxAge);
		
	}
	
	public void setMinAge(int minAge)
	{
		
		this.minAge = minAge;
		
	}
	
	public int getMinAge()
	{
		
		return this.minAge;
		
	}
	
	public void setMaxAge(int maxAge)
	{
		
		this.maxAge = maxAge;
		
	}
	
	public int getMaxAge()
	{
		
		return this.maxAge;
		
	}
	
	//@Override
	public double salesValue(int numOfCopies)
	{
		
		return price * numOfCopies * (1.0 - 0.35);
		
	}
	
	public String toString()
	{
		
		return String.format("%s %s %s %d-%d %d %f", this.getTitle(), 
						this.getAuthor(), this.getPublisher(), this.getMinAge(), this.getMaxAge(), 
						this.getNumOfPages(), this.getPrice());
		
	}
	
	//@Override
	public boolean equals(Object o)
	{
		
		return super.equals(o) && 
				this.getMinAge == ((ChildBook) o).getMinAge &&
				this.getMaxAge == ((ChildBook) o).getMaxAge;
		
	}
	
}