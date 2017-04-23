package org.peiwen.liu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle1");		
		triangle.draw();
	}

}
