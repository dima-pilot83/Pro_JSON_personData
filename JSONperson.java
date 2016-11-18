package ru.mail.dimapilot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class JSONperson {

	public static Object loadFromJSON(File file) {
		Gson gson = new Gson();
		Object object = null;
		try {
		object = gson.fromJson(new FileReader(file), Object.class);
		
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
		e.printStackTrace();
		} return object;
		}
	
	
}
