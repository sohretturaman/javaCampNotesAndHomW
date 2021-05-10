package Entities;

import Abstracts.Entity;

public class Customer implements Entity{
    int id ;
    String firstName ;
    String LastName ;
    Long nationalityNumber ;
    int dateOfBirth ;
    
    
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
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Long getNationalityNumber() {
		return nationalityNumber;
	}
	public void setNationalityNumber(Long nationalityNumber) {
		this.nationalityNumber = nationalityNumber;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
