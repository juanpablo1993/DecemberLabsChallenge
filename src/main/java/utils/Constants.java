package utils;

public class Constants {

	public static final String PROPERTIES_NAME = "decemberLabs.properties";
	private static PropertyReader props = new PropertyReader();
	
	public static String getContextUrl() {
		return props.getString("baseUrl");
	}
}
