package model;

import java.io.Serializable;

public class AdoptionApplication implements Serializable{
	private Adopter adopter;
	private Animal animal;
	private String applicationDate;
	private ApplicationStatus status;
	
	public AdoptionApplication(Adopter adopter, Animal animal, String applicationDate){
		this.adopter = adopter;
		this.animal = animal;
		this.applicationDate = applicationDate;
		
		status = ApplicationStatus.PENDING;
	}
	
	public Adopter getAdopter(){
		return adopter;
	}
	public Animal getAnimal(){
		return animal;
	}
	public String getApplicationDate(){
		return applicationDate;
	}
	public ApplicationStatus getStatus(){
		return status;
	}
	public void setStatus(ApplicationStatus status){
		this.status = status;
	}
}
