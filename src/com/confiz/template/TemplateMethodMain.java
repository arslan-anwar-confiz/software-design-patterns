package com.confiz.template;

public class TemplateMethodMain {

	/**
	 * @author arpit mandliya
	 */
	public static void main(String[] args) {
		
		CSVDataParser csvDataParser=new CSVDataParser();
		csvDataParser.parseDataAndGenerateOutput();
		System.out.println("**********************");
		DatabaseDataParser databaseDataParser=new DatabaseDataParser();
		databaseDataParser.parseDataAndGenerateOutput();

	}

}
