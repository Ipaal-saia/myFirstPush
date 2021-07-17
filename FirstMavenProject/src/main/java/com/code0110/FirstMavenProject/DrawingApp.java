package com.code0110.FirstMavenProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Shape obj = (Shape)context.getBean("triangle");
		
		obj.draw();

  	}

}
