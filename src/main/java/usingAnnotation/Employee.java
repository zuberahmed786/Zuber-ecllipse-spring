package usingAnnotation;

import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	
	private Salary sal;
	public Employee(Salary sal) {
		super();
		this.sal = sal;
	}
	public void doWork()
	{
		System.out.println("I am Working in ZMQ");
		sal.increment();
	}

}
