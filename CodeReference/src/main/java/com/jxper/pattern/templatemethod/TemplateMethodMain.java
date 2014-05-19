package com.jxper.pattern.templatemethod;

public class TemplateMethodMain {

	public static void main(String[] args) {  
	      
	    DataParserCSV csvDataParser = new DataParserCSV();  
	    csvDataParser.parseDataAndGenerateOutput();  
	    System.out.println("**********************");  
	    DataParserDatabase databaseDataParser = new DataParserDatabase();  
	    databaseDataParser.parseDataAndGenerateOutput();  

	} 
	
}
