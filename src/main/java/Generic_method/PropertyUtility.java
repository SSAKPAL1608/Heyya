package Generic_method;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	public class PropertyUtility {

	    private Properties properties;

	    public PropertyUtility(String filePath) {
	        properties = loadProperties(filePath);
	    }

	  public Properties loadProperties(String filePath) {
	        Properties props = new Properties();
	        try 
	        (FileInputStream input = new FileInputStream(filePath)) {
	            props.load(input);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return props;
	    }

	    public String getProperty(String key) {
	        return properties.getProperty(key);
	    }
		

	   
	}

