package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;



@Configuration
public class BeanConfig {
	
	
   @Bean(name="helloBean")
   //@Scope("prototype")
   public HelloWorld getHelloWorld(){
      return new HelloWorld();
   }
   
   @Bean
   
   public Employee getEmployee(){
      return new Employee();
   }
   
   @Bean(name="empService")
  
   public EmployeeService getEmployeeService(){
      return new EmployeeService();
   }
 
  
   
  
   
   /*@Bean
   public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
       PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
       propertySourcesPlaceholderConfigurer.setLocations(new ClassPathResource("data.properties"));
       return propertySourcesPlaceholderConfigurer;
   }*/
  
     
  
  
   
}
