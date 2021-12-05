package learn.spring;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeWithCollectionMap {

	int employeeNumber;
	String employeeName;
	Map<String, String> skillSet;
	
	
	
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



	public Map<String, String> getSkillSet() {
		return skillSet;
	}



	public void setSkillSet(Map<String, String> skillSet) {
		this.skillSet = skillSet;
	}



	void show(){  
	    System.out.println("Employee id : "+ employeeNumber + " : EmployeeName :  "+employeeName);
	    System.out.println("Employee Skillsets : ");
	    Set<Entry<String,String>> skillsMap = skillSet.entrySet();
	    Iterator<Entry<String,String>> skills = skillsMap.iterator();
	    while(skills.hasNext())
	    {
	    	Entry<String,String> skill = skills.next();
	    	System.out.println("Stream :"+skill.getKey()+" : Skills : "+skill.getValue());
	    }
	}  
	
}
