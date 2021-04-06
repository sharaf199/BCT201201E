package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Shared {
	
	public static Properties readProp(String path) throws IOException {
		File f =new File("config.properties");
		FileInputStream fi =new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fi);
		return prop;
	}
}
