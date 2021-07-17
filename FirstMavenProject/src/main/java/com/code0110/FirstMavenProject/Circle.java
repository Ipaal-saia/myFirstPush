package com.code0110.FirstMavenProject;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{
		
	public void draw() {
		System.out.println("Circle Drawn");
	}

}

