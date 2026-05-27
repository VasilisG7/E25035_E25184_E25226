package model;

import java.io.Serializable;
import java.util.ArrayList;

public class MedicalRecord implements Serializable{
private ArrayList<MedicalEntry> entries;
	
	public MedicalRecord(){
		entries = new ArrayList<>();
	}
	
	public void addMedicalEntry(MedicalEntry entry){
		entries.add(entry);
	}
	
	public ArrayList<MedicalEntry> getEntries(){
		return entries;
	}
}
