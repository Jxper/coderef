package com.jxper.pattern.templatemethod;

public class DataParserCSV extends DataParser {

	@Override
	void readData() {
		System.out.println("Reading data from csv file");  
	}

	@Override
	void processData() {
		System.out.println("Looping through loaded csv file");
	}
}
