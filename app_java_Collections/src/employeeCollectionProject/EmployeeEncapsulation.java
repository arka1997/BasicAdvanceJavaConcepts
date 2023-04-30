package employeeCollectionProject;

public class EmployeeEncapsulation {
	//Here Encapsulation is used, and from another class, this private variables will be accessed along with ArrayList Concept
	String email;
	public int number;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private int id;
	EmployeeEncapsulation(){
		
	}
	EmployeeEncapsulation(String email,int number){
		this.email = email;
		this.number = number;
	}
	EmployeeEncapsulation(String firstName,String lastName, int id){
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int id() {
		return id;
	}
	public void setLoginDetails(String username,String password,int id) {
		this.username = username;
		this.password = password;
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
}
