public class Main {
    public static void main(String[] args) {
        ConfigManager configManager = ConfigManager.getInstance();

        // Setting properties
        configManager.setProperty("appName", "MyApplication");
        configManager.setProperty("version", "1.0.0");
        configManager.setProperty("developer", "John Doe");

        // Saving the configuration to file
        configManager.saveConfig();

        // Retrieving properties
        System.out.println("App Name: " + configManager.getProperty("appName"));
        System.out.println("Version: " + configManager.getProperty("version"));
        System.out.println("Developer: " + configManager.getProperty("developer"));
    }
}
