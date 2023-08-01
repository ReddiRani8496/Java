import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingConsoleHandler {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(LoggingConsoleHandler.class.getName());
        
        logger.setLevel(Level.CONFIG);
        ConsoleHandler console = new ConsoleHandler();
        console.setLevel(Level.CONFIG);

        logger.addHandler(console);
        logger.setLevel(Level.CONFIG);
        logger.config("config level");
        logger.severe("severe level");
//
//        logger.severe("severe");
//        logger.config("config");
//        logger.info("info");


    }
}
