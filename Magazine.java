/*


*/

public class Magazine extends Publication
{
	
	PublicationUnit pubUnit;
	
	public Magazine()
	{
		
		
		
	}
	
	public Magazine(String title, String publisher, int numOfPages, double price, PublicationUnit pubUnit)
	{
		
		this.setTitle(title);
		this.setPublisher(publisher);
		this.setNumOfPages(numOfPages);
		this.setPrice(price);
		this.setOPubUnit(pubUnit);
		
	}
	
	public void setPubUnit(PublicationUnit pubUnit)
	{
		
		this.pubUnit = pubUnit;
		
	}
	
	public PublicationUnit getPubUnit()
	{
		
		return this.pubUnit;
		
	}
	
	public double salesValue(int numOfCopies)
	{
		
		return price * numOfCopies * (1.0 - 0.4);
		
	}
	
	//@Override
	public String toString()
	{
		
		return super.toString() + String.format(" %s", this.getPubUnit());
		
	}
	
	//@Override
	public boolean equals(Object o)
	{
		
		return super.equals(o) && 
				this.pubUnit.toString().equals(((Magazine) o).pubUnit);
		
	}
	
}