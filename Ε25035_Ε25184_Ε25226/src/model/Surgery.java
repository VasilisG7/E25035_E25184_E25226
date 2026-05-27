package model;

public class Surgery implements MedicalEntry{
	private String date;
	private String description;
	private Vet  vet;
	
	public Surgery(String date, String description, Vet vet){
		this.date = date;
		this.description = description;
		this.vet = vet;
	}

	@Override
	public String getDate() {
		return null;
	}

	@Override
	public String getDescription() {
		return null;
	}

	@Override
	public Vet getVet() {
		return null;
	}
}
