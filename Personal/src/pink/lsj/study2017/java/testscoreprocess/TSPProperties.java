package pink.lsj.study2017.java.testscoreprocess;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

class TSPProperties {
	private static final Properties properties = new Properties();
	private static final Map<String, String> defaults = new HashMap<>();

	TSPProperties(String[] keys, String[] values, String path) throws IOException {
		properties.load(new FileReader(path));
		for(int keysIndex = 0; keysIndex < keys.length; keysIndex++)
			defaults.put(keys[keysIndex], values[keysIndex]);
	}

	TSPProperties(String[] keys, String[] values) {
		for(int keysIndex = 0; keysIndex < keys.length; keysIndex++)
			defaults.put(keys[keysIndex], values[keysIndex]);
	}

	static String set(String key, String value) {
		properties.setProperty(key, value);
		return value;
	}

	static String get(String key) {
		return (properties.getProperty(key) == null) ? ((defaults == null) ? null : defaults.get(key)) : properties.getProperty(key);
	}

	static boolean isSet(String key) {
		return (properties.getProperty(key) != null);
	}

	static void setToDefault(String key) {
		properties.setProperty(key, defaults.get(key));
	}

	static void saveToFile(String path) throws IOException {
		properties.store(new FileOutputStream(path),
				String.format("Created at %s by TestScoreProcess.\nCopyright (C) Lee-Sung-Jae, All rights reserved.",
						(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")).format(new Date()).toString()));
	}
}
