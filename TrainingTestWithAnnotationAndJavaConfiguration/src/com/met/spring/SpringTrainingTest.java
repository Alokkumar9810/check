package com.met.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.met.config.TrainingConfiguration;
import com.met.model.Workshop;

public class SpringTrainingTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(TrainingConfiguration.class);
		System.out.println("***************Post Initialization***************");
		Workshop workshop = context.getBean("trainingWorkshop", Workshop.class);
		workshop.conductWorkshop();
	}

}
