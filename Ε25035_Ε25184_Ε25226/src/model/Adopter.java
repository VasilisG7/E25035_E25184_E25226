package model;

public class Adopter extends User{
	private String address;
	private String profile;
	private int age;
	
	public Adopter(String username, String password, String firstName, String lastName, String phoneNumber, String email, String Address, String profile, int age){
		super(username, password, firstName, lastName, phoneNumber, email);
		
		this.address = address;
		this.profile = profile;
		this.age = age;
	}
	
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getProfile(){
		return profile;
	}
	public void setProfile(String profile){
		this.profile = profile;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
}
