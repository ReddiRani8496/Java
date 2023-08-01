import java.util.logging.Logger;

public class LoggingEx2 {
    public static void main(String[] args) {
        final Logger logger = Logger.getLogger(LoggingEx2.class.getName());
        logger.severe("severe");
        logger.warning("warning");
        logger.info("info"); // by default the levels will be printed upto info level
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");
    }
}
