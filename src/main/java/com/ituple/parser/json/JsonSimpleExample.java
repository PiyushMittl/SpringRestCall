package com.ituple.parser.json;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonSimpleExample {
	public static void main(String[] args) {
		
		JSONParser parser = new JSONParser();
		
		try {

			Object obj = parser.parse(new FileReader("C:\\Piyush\\test.json"));
			JSONObject jsonObject = (JSONObject) obj;

			System.out.println(jsonObject);

		}
		catch (Exception e) {
		}
		
		
		
		
	}

}