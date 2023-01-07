package com.met.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class METSolutions implements TrainingCompany {
	
	@Autowired
	private List<Trainer> trainers;
	
	
	public METSolutions() {
		super();
		System.out.println("Default Constructor METSolution ");
	}

	public METSolutions(List<Trainer> trainers) {
		super();
		this.trainers = trainers;
		System.out.println("Parameterized Constructor METSolution ");
	}
	
	
	
	public List<Trainer> getTrainers() {
		return trainers;
	}

	public void setTrainers(List<Trainer> trainers) {
		this.trainers = trainers;
	}

	@Override
	public void conductTraining() {
		// TODO Auto-generated method stub
		System.out.println("METSolution :: counductTraining()");
		for(Trainer trainer: trainers)
		trainer.train();
	}

}
