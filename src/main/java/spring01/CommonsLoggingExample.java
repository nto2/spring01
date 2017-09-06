package spring01;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLoggingExample {

	static Log log = LogFactory.getLog(CommonsLoggingExample.class);
	static Logger log2 = Logger.getLogger(CommonsLoggingExample.class.getName());
	
	public static void main(String[] args) {
		
		log2.log(Level.INFO, "Java sandard logger...");

		log.trace("Commons 1. TRACE level log");
		log.debug("Commons 2. DEBUG level log");
		log.warn( "Commons 3. WARN level log");
		log.info( "Commons 4. INFO level log");
		log.error("Commons 5. ERROR level log");
		log.fatal("Commons 6. FATAL level log");
		
		log.info("###########################");
	}

}
