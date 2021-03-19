 /*
 
 
 
 */
 
 public class Book extends Publication
 {
	 
	private String author;
	 
	public Book()
	{
		
		
		
	}
	 
	public Book(String title, String publisher, int numOfPages, 
				double price, String author)
	{
		
		this.setTitle(title);
		this.setPublisher(publisher);
		this.setNumOfPages(numOfPages);
		this.setPrice(price);
		this.setAuthor(author);
		
	}
	 
	public void setAuthor(String author)
	{
		
		this.author = author;
		
	}
	
	public String getAuthor()
	{
		
		return this.author;
		
	}
	
	//@Override
	public double salesValue(int numOfCopies)
	{
		
		return this.getPrice() * numOfCopies;
		
	}
	
	//@Override
	public String toString()
	{
		
		return String.format("%s %s %s %d %f", this.getTitle(), this.getAuthor(), this.getPublisher(), this.getNumOfPages(), this.getPrice());
		
	}

	//@Override
	public boolean equals(Object o)
	{
		
		return super.equals(o) && this.author.equals(((Book) o).author);
		
	}
	 
 }