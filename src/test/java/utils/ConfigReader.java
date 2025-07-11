package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

	private static Properties properties = new Properties();
	
	public static void loadProperties() {
		try(InputStream input = ConfigReader.class.getClassLoader()
                .getResourceAsStream("config/config.properties")) {
			   if (input == null) {
	                throw new RuntimeException("config.properties not found");
	            }
	            properties.load(input);
			
		} catch(IOException e) {
			throw new RuntimeException("Failed to load config properties", e);
		}
	}
	
	 public static String getProperty(String key) {
	        if (properties.isEmpty()) {
	            loadProperties();
	        }
	        return properties.getProperty(key);
	    }
	
}
