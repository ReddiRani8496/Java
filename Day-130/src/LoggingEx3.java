import java.io.IOException;
import java.util.logging.*;

public class LoggingEx3 {

    public static void main(String[] args) throws IOException {

        final Logger logger = Logger.getLogger(LoggingEx2.class.getName());

//        ConsoleHandler consoleHandler = new ConsoleHandler(); // by default data will be stored in consoleHandler and displayed on console
//        consoleHandler.setLevel(Level.FINEST);
//         logger.addHandler(consoleHandler); // adding ConsoleHandler to the logger

        FileHandler fileHandler = new FileHandler("LoggingData.log",true); // log messages to a file and log messages will be appended to the file

        fileHandler.setLevel(Level.FINEST); // it will log all messages
        fileHandler.setFormatter(new XMLFormatter()); // set the formatter to xml format
        logger.setUseParentHandlers(false); //  Prevent the logger from using the console handler by default
        logger.addHandler(fileHandler);
        logger.setLevel(Level.FINEST); // log all levels of messages
        logger.severe("severe");
        logger.warning("warning");
        logger.info("info");
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");
    }
}
