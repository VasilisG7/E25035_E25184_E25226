package model;

import java.io.Serializable;

public class Vaccination implements MedicalEntry, Serializable{
	private String date;
	private String description;
	private Vet vet;
	
	public Vaccination(String date, String description, Vet vet){
		
		this.date = date;
		this.description = description;
		this.vet = vet;
	}
	
	@Override
	public String getDate(){
		return date;
	}

	@Override
	public String getDescription(){
		return description;
	}

	@Override
	public Vet getVet(){
		return vet;
	}
}
