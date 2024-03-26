package uab.ready2go.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UtilLogger {
    /**
     * Logger
     */
    private static Logger log = LogManager.getLogger(UtilLogger.class);

    /**
     * Takes message info to save in log.
     *
     * @param c       Class where does the information come from.
     * @param type    Type of log.
     * @param message Message to save.
     */
    public static void registerInfo(Class c, LogType type, String message) {
        log = LogManager.getLogger(c);

        switch (type) {
            case DEBUG:
                log.debug(message);
                break;
            case ERROR:
                log.error(message);
                break;
            case INFO:
                log.info(message);
                break;
            case WARNING:
                log.warn(message);
                break;
        }
    }
}
