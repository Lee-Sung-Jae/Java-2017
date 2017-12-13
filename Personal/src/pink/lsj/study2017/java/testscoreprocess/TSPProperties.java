package pink.lsj.study2017.java.testscoreprocess;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class TSPProperties {
	private static Properties properties = new Properties();
	private static Map<String, String> defaults = new HashMap<>();

	protected TSPProperties(String[] keys, String[] values) {
		for (int i = 0; i < keys.length; i++)
			defaults.put(keys[i], values[i]);
	}

	protected TSPProperties(String[] keys, String[] values, String path) throws IOException {
		properties.load(new FileReader(path));
		for (int i = 0; i < keys.length; i++)
			defaults.put(keys[i], values[i]);
	}

	protected String set(String key, String value) {
		properties.setProperty(key, value);
		return value;
	}

	protected String get(String key) {
		return (properties.getProperty(key) == null) ? ((defaults == null) ? null : defaults.get(key)) : properties.getProperty(key);
	}

	protected boolean isSet(String key) {
		return (properties.getProperty(key) != null);
	}

	protected void setToDefault(String key) {
		properties.setProperty(key, defaults.get(key));
	}
}
