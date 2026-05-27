package model;

import java.io.Serializable;

public class Animal implements Serializable{
	private int id;
	private String name;
	private AnimalType type;
	private int age;
	private String description;
	private MedicalRecord medicalRecord;

	public Animal(int id, String name, AnimalType type, int age, String description){
		this.id = id;
		this.name = name;
		this.type = type;
		this.age = age;
		this.description = description;
		medicalRecord = new MedicalRecord();
	}
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public AnimalType getType(){
		return type;
	}
	public void setType(AnimalType type){
		this.type = type;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	public String getDescription(){
		return description;
	}
	public void setDescription(String description){
		this.description = description;
	}
	
	public MedicalRecord getMedicalRecord(){
		return medicalRecord;
	}
}
