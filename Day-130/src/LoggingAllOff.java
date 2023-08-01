import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingAllOff {

    public static void main(String[] args) {

        final Logger logger = Logger.getLogger(LoggingAllOff.class.getName());

        logger.warning("This is a warning level log"); // By default, loggers have a level of WARNING, so this message will be logged

        logger.info("This is an info level log"); // loggers have a level of WARNING, so this message will not be logged

        ConsoleHandler consoleHandler = new ConsoleHandler();

        consoleHandler.setLevel(Level.ALL); // display all log messages

        logger.addHandler(consoleHandler); //  ConsoleHandler added to the logger so that log messages are displayed on the console

        // logger.setLevel(Level.OFF); // if level is off, remaining log levels will not print

        logger.setLevel(Level.CONFIG);

        logger.config("This is a config level log");

        logger.severe("This is a severe level log");

    }
}
