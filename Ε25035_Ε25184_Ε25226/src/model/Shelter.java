package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Shelter implements Serializable{
	private String name;
	private String phoneNumber;
	private String address;
	private ArrayList<User> users;
	private ArrayList<Animal> animals;
	private ArrayList<AdoptionApplication> applications;
	
	public Shelter(String name, String phoneNumber, String address){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		users = new ArrayList<>();
		animals = new ArrayList<>();
		applications = new ArrayList<>();
	}
	public void addUser(User user){
		users.add(user);
	}
	public void removeUser(User user){
		users.remove(user);
	}
	public void editUser(User user, String username, String password, String firstName, String lastName, String phoneNumber, String email){
		user.setUsername(username);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setPhoneNumber(phoneNumber);
		user.setEmail(email);
	}
	public void editAdopter(Adopter adopter, String address, String profile, int age){
		adopter.setAddress(address);
		adopter.setProfile(profile);
		adopter.setAge(age);
	}
	
	public void addAnimal(Animal animal){
		animals.add(animal);
	}
	public void removeAnimal(Animal animal){
		animals.remove(animal);
	}
	public void editAnimal(Animal animal, String name, AnimalType type, int age, String description){
		animal.setName(name);
		animal.setType(type);
		animal.setAge(age);
		animal.setDescription(description);
	}
	
	public void addApplication(AdoptionApplication application){
		applications.add(application);
	}
	
	public ArrayList<User> getUsers(){
		return users;
	}
	public ArrayList<Animal> getAnimals(){
		return animals;
	}
	public ArrayList<AdoptionApplication> getApplication(){
		return applications;
	}
	
	public void approveApplication(AdoptionApplication application){
		application.setStatus(ApplicationStatus.APPROVED);
		for (AdoptionApplication app : applications){
			if (app != application && app.getAnimal() == application.getAnimal()){
				app.setStatus(ApplicationStatus.REJECTED);
			}
		}
	}
	
	public void rejectedApplication(AdoptionApplication application){
		application.setStatus(ApplicationStatus.REJECTED);
	}
	
	public ArrayList<Animal> getAnimalByType(AnimalType type){
		ArrayList<Animal> filteredAnimals = new ArrayList<>();
		for (Animal animal : animals){
			if (animal.getType() == type){
				filteredAnimals.add(animal);
			}
		}
		return filteredAnimals;
	}
	
	public boolean hasActiveApplication(Adopter adopter){
		for (AdoptionApplication application : applications){
			if (application.getAdopter() == adopter && application.getStatus() == ApplicationStatus.PENDING){
				return true;
			}
		}
		return false;
	}
}
