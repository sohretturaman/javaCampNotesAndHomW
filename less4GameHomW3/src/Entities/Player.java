package Entities;

public class Player {
   private int id ;
   private String firstName ;
   private String lastName ;
   private String nationalityNumber ;
   private String dateOfBirth ;

   
    
	public Player() {
		super();
	}
	public Player(int id, String firstName, String lastName, String nationalityNumber, String dateOfBirth) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityNumber = nationalityNumber;
		this.dateOfBirth = dateOfBirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalityNumber() {
		return nationalityNumber;
	}
	public void setNationalityNumber(String nationalityNumber) {
		this.nationalityNumber = nationalityNumber;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
