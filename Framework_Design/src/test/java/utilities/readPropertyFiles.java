package utilities;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readPropertyFiles {

	public static void main(String[] args) throws IOException {


		
		FileReader fr = new FileReader(System.getProperty("user.dir")+ "\\resources\\configfiles\\config.properties");
		Properties p = new Properties();
		p.load(fr);
		p.getProperty("browser");
		p.getProperty("testurl");

	}

}
