package learn.spring;

import java.util.Iterator;
import java.util.List;

public class EmployeeWithAddressList {

	int employeeNumber;
	String employeeName;
	List<Address> address;//aggregation - has a relationship
	
	
	public int getEmployeeNumber() {
		return employeeNumber;
	}



	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public List<Address> getAddress() {
		return address;
	}



	public void setAddress(List<Address> address) {
		this.address = address;
	}



	void show(){  
	    System.out.println("Employee id : "+ employeeNumber + " : EmployeeName :  "+employeeName);
	    Iterator<Address> addresses = address.iterator();
	    while(addresses.hasNext())
	    {
	    	Address address = addresses.next();
	    	System.out.println("Employee Address : "+address.city+","+address.state+","+address.country);
	    }
	}  
	
}
