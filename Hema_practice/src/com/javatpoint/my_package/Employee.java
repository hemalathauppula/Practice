package com.javatpoint.my_package;

public class Employee 
{
    private int id;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String firstName,lastName;
   
    public String getFirstName() 
    {
	    return firstName;
    }
    public void setFirstName(String firstName) 
    {
	   this.firstName = firstName;
    }
    public String getLastName() 
   {
	    return lastName;
   }
   public void setLastName(String lastName)
   {
	   this.lastName = lastName;
   }

}
