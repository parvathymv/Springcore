package com.autowire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AutowiringMain {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("Beans.xml");
		//Autowiring by name
		Author author = (Author) context.getBean("author1");
		System.out.println("Author Name :" + author.getName());
		System.out.println("Book details");
		System.out.println("Name :" + author.getBk().getBookName());
		System.out.println("Price :" + author.getBk().getBookPrice());
		System.out.println("Edition :" + author.getBk().getEdition());
	  //Autowiring by type
//	Author authorObj=(Author)context.getBean("author1");
//	System.out.println("Author Name :"+authorObj.getName());
//	System.out.println("Book details");
//	System.out.println("Name :"+authorObj.getBook().getBookName());
//		System.out.println("Price :"+authorObj.getBook().getBookPrice());
//		System.out.println("Edition :"+authorObj.getBook().getEdition());

		 //Autowiring by constructor
//	Author authorObj2=(Author)context.getBean("author2");
//		System.out.println("Author Name :"+authorObj2.getName());
//		System.out.println("Book details");
//		System.out.println("Name :"+authorObj2.getBook().getBookName());
//		System.out.println("Price :"+authorObj2.getBook().getBookPrice());
		//System.out.println("Edition :"+authorObj2.getBook().getEdition());
	}
}
