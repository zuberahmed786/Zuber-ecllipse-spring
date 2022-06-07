package usingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnnot {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Employee emp = (Employee)context.getBean("emp",Employee.class);
	    emp.doWork() ;
	    
	}

}
