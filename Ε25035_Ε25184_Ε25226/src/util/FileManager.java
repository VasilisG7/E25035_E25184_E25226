package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.Shelter;

public class FileManager{
	public static void saveShelter(Shelter shelter){
		try{
			FileOutputStream fileOut = new FileOutputStream("shelter.dat");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(shelter);
			objectOut.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static Shelter loadShelter(){
		try{
			FileInputStream fileIn = new FileInputStream("shelter.dat");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			Shelter shelter = (Shelter) objectIn.readObject();
			objectIn.close();
			return shelter;
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
