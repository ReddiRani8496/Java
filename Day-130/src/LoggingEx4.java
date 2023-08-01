import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggingEx4 {
    public static void main(String[] args) throws IOException {
        final Logger logger = Logger.getLogger(LoggingEx4.class.getName()); // // logger instance for the current class

        FileHandler fileHandler = new FileHandler("LoggingData.log",true); // to log messages to a file and log messages will be appended to the file
        fileHandler.setFormatter(new SimpleFormatter()); // log records as text
        fileHandler.setLevel(Level.ALL); //  log all messages
        logger.addHandler(fileHandler);
        fileHandler.setLevel(Level.OFF); // disables logging

        // since the logger's logging level is OFF, these messages will not be logged.
        logger.severe("severe");
        logger.warning("warning");
        logger.info("info");
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");
    }
}
