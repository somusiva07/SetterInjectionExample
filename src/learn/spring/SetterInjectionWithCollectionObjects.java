package learn.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SetterInjectionWithCollectionObjects {

	public static void main(String args[])
	{
		
		  Resource resource = new ClassPathResource("appContext_SIwithCollectionObject.xml");
		  BeanFactory factory = new XmlBeanFactory(resource);
		  
		  //Employee employee = factory.getBean(Employee.class); 
		  EmployeeWithAddressList employee = (EmployeeWithAddressList)factory.getBean("employeeAddressList");
		  employee.show();
		 
		
	 
	}
	
}
