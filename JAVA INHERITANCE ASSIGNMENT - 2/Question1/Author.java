
public class Author {
	
	private String name;
	private String email;
	private char gender;
	
	
	public Author(String name, String email, char gender) 
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() { return name;}
	public char getGender() { return gender;}
	public String getEmail() {return email;}
	
	/*Author() {
		name = "George Maxwell Dery";
		email = "d4dery@gmail.com";
		gender = 'M';*/
	//}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return name + " (" + gender + ") at " + email;
		}

		
	public static void main(String args[]) {	
		Author a = new Author("George Maxwell Dery", "ddery@gmail.org", 'm');
		System.out.println(a);
		
		a.setEmail("dery4d@yahoo.com");
		System.out.println(a);
		
		/*System.out.println("Name: " + a.getName());
		System.out.println("Gender: " + a.getGender());
		System.out.println("Email: "+  a.getEmail());*/
		
	}
}


