package methodOverloading;

public class Logger {

    // Method to display an informational message
    public void log(String message) {
        System.out.println("[INFO] " + message);
    }

    // Method to display a log message with a custom log level (e.g., warning, error)
    public void log(String message, String level) {
        System.out.println("[" + level.toUpperCase() + "] " + message);
    }

    // Method to display a log message with a level and the user who generated it
    public void log(String message, String level, String user) {
        System.out.println("[" + level.toUpperCase() + "] " + message + " - User: " + user);
    }

    public static void main(String[] args) {
        Logger logger = new Logger();

        // Call the log method with just a message (Info log)
        logger.log("This is an informational message.");

        // Call the log method with a custom level (e.g., warning log)
        logger.log("This is a warning message.", "warning");

        // Call the log method with a custom level and user info
        logger.log("This is an error message.", "error", "admin");
    }
}
