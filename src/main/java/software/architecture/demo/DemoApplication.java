package software.architecture.demo;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
				JoranConfigurator configurator = new JoranConfigurator();
				configurator.setContext(loggerContext);
				loggerContext.reset();
				try {
					configurator.doConfigure("src/main/java/logback.xml");
				} catch (JoranException e) {
					e.printStackTrace();
				}
		StatusPrinter.printInCaseOfErrorsOrWarnings(loggerContext);
	}

}
