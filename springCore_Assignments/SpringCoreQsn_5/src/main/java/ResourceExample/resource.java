package ResourceExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ResourceExample.Employee;

public class resource {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("resource.xml");

		Employee emp = ac.getBean("myemployee", Employee.class);
		System.out.println(emp.toString());
	}
}