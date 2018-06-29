package warmup;



public class Book {
	
	String Author;

	String Title;

	String Type;

	double Price;
	
	public Book() {
		System.out.println("here is book info");
	}

	public Book(String Author) {
		this();
		this.Author=Author;
	}

	public Book(String Author,String Title) {
		this(Author);
		this.Title=Title;		

	}
	
	public Book(String Author,String Title,String Type) {
		this(Author,Title);
		this.Type=Type;

	}
		
	public void setBookInformation(String Author,String Title,String Type, double Price){
		this.Author=Author;
		this.Title=Title;
		this.Type=Type;
		this.Price=Price;
		System.out.println("Author: "+Author+"\nTitle: "+Title+"\nType: "+Type+"\nPrice: "+Price);
	}
	
	public Book(String Author,String Title,String Type, double Price) {
		setBookInformation(Author,Title,Type,Price);
	}
	
	public static void main(String[] args) {
		Book b=new Book();
		b.setBookInformation("John","Java OCA","Audio",99.85);
		System.out.println(b.Type);
		Book b1=new Book("Ike");
		System.out.println(b1.Author);
	}

}
