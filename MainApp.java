package testproj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import testproj.beans.Employee;
import testproj.beans.Person;
import testproj.beans.Player;
import testproj.beans.ShapeCollection;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Helloworld obj = (Helloworld) context.getBean("obj");
		System.out.println(obj.hashCode());
		//System.out.println(obj.displayMessage());
		
		Helloworld obj1 = (Helloworld) context.getBean("obj");
		System.out.println(obj1.hashCode());
		
		Helloworld obj2 = (Helloworld) context.getBean("obj");
		System.out.println(obj2.hashCode());
		
		Player player=(Player) context.getBean("player");
		System.out.println(player);
		
		Player player1=(Player) context.getBean("player1");
		System.out.println(player1);
		
		Player player2=(Player) context.getBean("player2");
		System.out.println(player2);
		
		Person person=(Person) context.getBean("person");
		System.out.println(person);
		
		Person person1=(Person) context.getBean("person1");
		System.out.println(person1);
		
		Employee emp=(Employee) context.getBean("employee");
		System.out.println(emp);
		
		Person person2=(Person) context.getBean("person2");
		System.out.println(person2);
		
		ShapeCollection shape=(ShapeCollection) context.getBean("shape");
		System.out.println(shape);
		
	}

}
