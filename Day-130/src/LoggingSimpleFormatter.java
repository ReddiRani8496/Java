import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggingSimpleFormatter {
    public static void main(String[] args) throws IOException {
        final Logger logger = Logger.getLogger(LoggingSimpleFormatter.class.getName());

        FileHandler fileHandler = new FileHandler("NewLogData",true);
        fileHandler.setLevel(Level.CONFIG); // it will log messages at CONFIG level and above
        fileHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(fileHandler);
        logger.setLevel(Level.CONFIG);
        logger.config("File configuration done successfully");

        if(true) {
            logger.setLevel(Level.INFO); // logging messages at the INFO level and above
            logger.info("Info leve");
        }
    }
}
