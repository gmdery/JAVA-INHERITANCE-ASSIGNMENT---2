
public class Book {
	
	String name;
	Author author;
	double price;
	int qty;
	public Book(String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	String getName() { return name;}
	Author getAuthor() { return author;}
	double getPrice() { return price;}
	int getQty() {return qty;}
	void setPrice(double price) {
		this.price = price;
	}
	void setQty(int qty) {
		this.qty = qty;
	}
	public String toString() {
		return "'" + name + " ' by " + author;
		}

	public static void main(String[] args) {
		Author a = new Author("George Maxwell Dery", "ddery@gmail.org", 'm');
		System.out.println(a);
        Book b = new Book("Positivity",a,10.99,200);
        System.out.println(b);
       /* b.setPrice(12.99);
        b.setQty(175);
        System.out.println("New Price" + b.getPrice());
        System.out.println("New Quantity" + b.getQty());*/
		

	}

}
