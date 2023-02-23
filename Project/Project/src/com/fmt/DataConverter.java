package com.fmt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataConverter {
	
	public static List<Item> loadItemData(String fileName){
	
		List<Item> result = new ArrayList<Item>();
		File f = new File(fileName);
		
		Scanner s;
		try {
			s = new Scanner(f);
			String line = s.nextLine();
			int n = Integer.parseInt(line);
			
			for(int i = 0; i<n; i++) {
				line = s.nextLine();
				Item e = null;
				String tokens[] = line.split(",");
				String itemCode = tokens[0];
				String type = tokens[1];
				String name = tokens[2];
				
				if(type == "E") {
					String model = tokens[3];
					e = new Equipment(itemCode,type,name,model);
				} else if(type == "P") {
					String size = tokens[3];
					double cost = Double.parseDouble(tokens[4]);
					e = new Product(itemCode, type, name, size, cost);
				} else if(type == "S") {
					double hourlyRate = Double.parseDouble(tokens[3]);
					e = new Service(itemCode, type, name, hourlyRate);
				}
				result.add(e);
			}
		}catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		s.close();
		return result;
}
	
	public static List<Person> loadPersonData(String fileName){
		
		List<Person> result = new ArrayList<Person>();
		File f = new File(fileName);
		
		Scanner s;
		try {
			s = new Scanner(f);
			String line = s.nextLine();
			int n = Integer.parseInt(line);
			
			for(int i = 0; i<n; i++) {
				line = s.nextLine();
				Person e = null;
				String tokens[] = line.split(",");
				String personCode = tokens[0];
				String lastName = tokens[1];
				String firstName = tokens[2];
				String street = tokens[3];
				String city = tokens[4];
				String state = tokens[5];
				String zip = tokens[6];
				String country = tokens[7];
				
				
				
				this.email1 = email1;
				this.email2 = email2;
				this.email3 = email3;
				
				
				result.add(e);
			}
		}catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		s.close();
		
		
		return result;
	}
	
	public static void main(String[] args) {
		
	}

}
