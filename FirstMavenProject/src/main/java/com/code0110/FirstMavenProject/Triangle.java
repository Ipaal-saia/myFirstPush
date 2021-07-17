package com.code0110.FirstMavenProject;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {
	
	public void draw() {
		System.out.println("Triangle Drawn");
	}

}
