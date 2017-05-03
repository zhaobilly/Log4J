package cs.billy;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jTest {
	public static void main(String[] args) {
		PropertyConfigurator.configure("../Log4J/src/Log.properties");
		Logger log=Logger.getLogger(Log4jTest.class.getName());
		log.info("yessssssssss");
	}
}
