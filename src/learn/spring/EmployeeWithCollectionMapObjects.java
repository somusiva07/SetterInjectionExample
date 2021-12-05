package learn.spring;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeWithCollectionMapObjects {

	int employeeNumber;
	String employeeName;
	Map<Address, Skills> addressSkills;
	
	
	
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



	public Map<Address, Skills> getAddressSkills() {
		return addressSkills;
	}



	public void setAddressSkills(Map<Address, Skills> addressSkills) {
		this.addressSkills = addressSkills;
	}



	void show(){  
	    System.out.println("Employee id : "+ employeeNumber + " : EmployeeName :  "+employeeName);
	    System.out.println("Employee Skillsets : ");
	    Set<Entry<Address, Skills>> skillsMap = addressSkills.entrySet();
	    Iterator<Entry<Address, Skills>> skills = skillsMap.iterator();
	    while(skills.hasNext())
	    {
	    	Entry<Address, Skills> skill = skills.next();
	    	System.out.println("Address :"+skill.getKey().city+","+skill.getKey().state+","+skill.getKey().country);
	    	System.out.println("Skills :"+skill.getValue().stream+","+skill.getValue().skills);
	    }
	}  
	
}
