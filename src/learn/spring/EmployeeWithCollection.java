package learn.spring;

import java.util.Iterator;
import java.util.List;

public class EmployeeWithCollection {

	int employeeNumber;
	String employeeName;
	List<String> skillSet;
	
	
	
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



	public List<String> getSkillSet() {
		return skillSet;
	}



	public void setSkillSet(List<String> skillSet) {
		this.skillSet = skillSet;
	}



	void show(){  
	    System.out.println("Employee id : "+ employeeNumber + " : EmployeeName :  "+employeeName);
	    System.out.println("Employee Skillsets : ");
	    Iterator<String> skills = skillSet.iterator();
	    while(skills.hasNext())
	    {
	    	System.out.println(skills.next());
	    }
	}  
	
}
