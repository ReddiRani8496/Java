import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingFileHandler {

    public static void main(String[] args) throws IOException {

        final Logger logger = Logger.getLogger(LoggingFileHandler.class.getName());

        FileHandler fileHandler = new FileHandler("LoggingData.log",true); // by default the format of log file will be xml format

        fileHandler.setLevel(Level.CONFIG); // log messages at CONFIG level and above

        logger.addHandler(fileHandler); //  the FileHandler is added to the logger so that log messages are directed to the file

        logger.setLevel(Level.CONFIG);

        logger.config("file configuration done successfully");

    }
}
