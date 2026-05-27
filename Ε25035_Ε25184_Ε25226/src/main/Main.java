package main;

import model.*;
import util.FileManager;

public class Main {

	public static void main(String[] args) {
Shelter shelter = new Shelter("katafigio", "2101111111", "Kamatero");  //  ******** ONOMA ********
		
		ShelterStaff staff = new ShelterStaff("staff1", "1234", "Basilakis", "Poustaras", "6911111111", "basilakispoustaras@gmail.com");
		shelter.addUser(staff);
		
		Vet vet = new Vet("vet1", "1234", "Basilis", "kolotripidis", "6922222222", "basiliskolotripisis@gmail.com");
		shelter.addUser(vet);
		
		Adopter adopter1 = new Adopter("adopter1", "1234", "Bill", "Gay", "6933333333", "BillGay@gmail.com", "Kamatero", "Omofilofilos", 18);
		shelter.addUser(adopter1);
		
		Adopter adopter2 = new Adopter("adopter2", "5678", "Billakis", "Bromiaris", "6944444444", "BillakisBromiaris@gmail.com", "Gerobouno", "GiaTonPoutso", 18);
		shelter.addUser(adopter2);
		
		Adopter adopter3 = new Adopter("adopter3", "6767", "Old", "Mountain", "6955555555", "OldMountain@gmail.com", "PoikiloOros", "SkataMeros", 18);
		shelter.addUser(adopter3);
		
		Animal animal1 = new Animal(1, "Dog1", AnimalType.DOG, 1, "GAY DOG");
		shelter.addAnimal(animal1);
		
		Animal animal2 = new Animal(2, "Dog2", AnimalType.DOG, 2, "GAY DOG");
		shelter.addAnimal(animal2);
		
		Animal animal3 = new Animal(3, "Dog3", AnimalType.DOG, 3, "GAY DOG");
		shelter.addAnimal(animal3);
		
		Animal animal4 = new Animal(4, "Cat4", AnimalType.CAT, 4, "GAY CAT");
		shelter.addAnimal(animal4);
		
		Animal animal5 = new Animal(5, "Cat5", AnimalType.CAT, 5, "GAY CAT");
		shelter.addAnimal(animal5);
		
		Animal animal6 = new Animal(6, "Cat6", AnimalType.CAT, 6, "GAY CAT");
		shelter.addAnimal(animal6);
		
		Animal animal7 = new Animal(7, "Bird7", AnimalType.BIRD, 7, "GAY BIRD");
		shelter.addAnimal(animal7);
		
		Animal animal8 = new Animal(8, "Bird8", AnimalType.BIRD, 8, "GAY BIRD");
		shelter.addAnimal(animal8);
		
		Animal animal9 = new Animal(9, "Bird9", AnimalType.BIRD, 9, "GAY BIRD");
		shelter.addAnimal(animal9);
		
		Animal animal10 = new Animal(10, "Dog10", AnimalType.DOG, 10, "GAY DOG");
		shelter.addAnimal(animal10);
		
		
		FileManager.saveShelter(shelter);
	
	}

}
