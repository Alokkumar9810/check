package com.met.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrainingWorkshop implements Workshop {
	
	
	private TrainingCompany trainingCompany;
	
	
	public TrainingWorkshop() {
		super();
		System.out.println("Default Constructor TrainingWorkshop");
	}

	@Autowired
	public TrainingWorkshop(TrainingCompany trainingCompany) {
		super();
		this.trainingCompany = trainingCompany;
		System.out.println("Parameterized Constructor TrainingWorkshop");
	}


	public TrainingCompany getTrainingCompany() {
		return trainingCompany;
		
	}


	public void setTrainingCompany(TrainingCompany trainingCompany) {
		this.trainingCompany = trainingCompany;
	}


	@Override
	public void conductWorkshop() {
		System.out.println("TrainingWorkshop :: conductWorkshop()");
		trainingCompany.conductTraining();
	}

}
