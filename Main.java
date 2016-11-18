package ru.mail.dimapilot;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		
		Object personOne = JSONperson.loadFromJSON(new File("1.txt"));
		System.out.println(personOne);
	}

}
