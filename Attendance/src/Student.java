
public class Student {
	
	protected String first;
	protected String last;


	public Student(String first, String last) {
		this.first = first;
		this.last = last;
	}
	
	public void firstName(String firstName) {
		this.first = firstName;
	}
	
	public void lastName(String lastName) {
		this.last = lastName;
	}
	
	
	public String getName() {
		return String.format("%s %s" ,first, last);
	}
	
	public boolean getPresent() {
		
		return Math.random() < 0.75;
	}
	
	public String toString() {
		return this.getName() + " is here: " + this.getPresent();
	}
	
} // end Student