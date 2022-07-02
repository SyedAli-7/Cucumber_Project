package com.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_Parser_Example {
	
	public static void main(String[] args) throws IOException, ParseException {
	
		File f = new File("C:\\Users\\SyedAli\\eclipse-workspace\\Maven_Project_Cucumber\\src\\test\\java\\com\\api\\Data.json");

		FileReader fr = new FileReader(f);
		
		JSONParser json = new JSONParser();
		
		Object parse = json.parse(fr);
		
		JSONObject obj = (JSONObject) parse; //Narrowing type casting
		
		Object val = obj.get("page");
		
		System.out.println("Value :" +val);
		
	}
	
	
	
	
	
	

}
