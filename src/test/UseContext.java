package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.Soldier;
import aop.Student;
import food.Chef;

public class UseContext {

	public static void main(String[] args) {
		String configLocation="spring/config/config.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		Chef chef=(Chef)context.getBean("chef");
		chef.cook();
		
		Soldier soldier=(Soldier)context.getBean("soldier");
		Student student=(Student)context.getBean("student");
		
		soldier.getUp();
		soldier.eat();
		soldier.rest();
		soldier.sleep();
		
		student.getUp();
		student.study();
		student.eat();
		student.goHome();
	}

}
