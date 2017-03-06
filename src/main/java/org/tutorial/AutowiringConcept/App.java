package org.tutorial.AutowiringConcept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.Autowiring.Cat;
import Com.Autowiring.Dog;
import Com.Autowiring.Elephant;
import Com.Autowiring.Rabbit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
	             new ClassPathXmlApplicationContext("applicationContext.xml");
    	 Dog dog = (Dog) context.getBean("dog");
    	 System.out.println(dog.toString());
    	 
    	 Elephant ele = (Elephant) context.getBean("elephant");
    	 System.out.println(ele.toString());
    	 
    	 Rabbit rab = (Rabbit) context.getBean("rabbit");
    	 System.out.println(rab.toString());
    }
}

