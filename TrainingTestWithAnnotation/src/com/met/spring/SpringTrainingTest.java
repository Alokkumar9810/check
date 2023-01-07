package com.met.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.met.model.METSolutions;
import com.met.model.Trainer;
import com.met.model.Workshop;

public class SpringTrainingTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("training.xml");
		System.out.println("***************Post Initialization***************");
		
		
		/*
		 * Trainer trainer = context.getBean("javaTrainer", Trainer.class);
		 * trainer.train();
		 */
		 
				
		/*
		 * METSolutions metSolutions
		 * =context.getBean("METSolutions",METSolutions.class);
		 * metSolutions.conductTraining();
		 */
		
		Workshop workshop = context.getBean("trainingWorkshop", Workshop.class);
		workshop.conductWorkshop();
	}

}
