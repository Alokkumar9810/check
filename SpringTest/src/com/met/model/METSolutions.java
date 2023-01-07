package com.met.model;

public class METSolutions implements TrainingCompany {
	
	private Trainer trainer;
	
	
	public METSolutions() {
		super();
		System.out.println("Default Constructor METSolution ");
	}

	public METSolutions(Trainer trainer) {
		super();
		this.trainer = trainer;
		System.out.println("Parameterized Constructor METSolution ");
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	@Override
	public void conductTraining() {
		// TODO Auto-generated method stub
		System.out.println("METSolution :: counductTraining()");
		trainer.train();
	}

}
