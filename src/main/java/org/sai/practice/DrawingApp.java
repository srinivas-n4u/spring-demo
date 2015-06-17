package org.sai.practice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Triangle triangle = new Triangle();
		//triangle.draw();
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/main/resources/spring.xml"));
		Triangle triangle = (Triangle) factory.getBean("triangle");
		
		triangle.draw();
	}

}
