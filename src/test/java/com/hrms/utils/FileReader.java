package com.hrms.utils;

import java.io.*;
import java.util.Properties;

public class FileReader {
	
	public static Properties prop;
	
	
	
/**
 * This Method will load properties File for reading
 * @param Properties filePath
 */
	public static void propertiesFileReader(String filePath) {

		try {
			FileInputStream fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * This Method will return value of property file based on provided Key.
	 * @param key of property file value
	 * @return value of specified key
	 */
	public static String getPropertyValue(String key) {
			return prop.getProperty(key);
		
	}

}
