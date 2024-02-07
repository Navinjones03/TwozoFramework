package org.twozo.components.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Class: PropertyFileReader
 * Description: This class provides functionality to read properties from a file.
 * Author: [Navin Jones]
 * Version: 1.0
 */

public final class PropertyFileReader {

    // Current directory path
    private static final String currentDirectory = System.getProperty("user.dir");

    // Path to the resources directory
    private static final String path = currentDirectory + "\\src\\main\\resources";

    // Properties object to store the loaded properties
    private static final Properties properties = new Properties();

    // Singleton instance of PropertyFileReader
    private static PropertyFileReader propertyFileReader;

    // Private constructor to prevent instantiation from outside the class
    private PropertyFileReader() {
    }

    /**
     * Gets the singleton instance of PropertyFileReader.
     *
     * @return The singleton instance of PropertyFileReader.
     */
    public static PropertyFileReader getInstance() {

        if (propertyFileReader == null) {
            propertyFileReader = new PropertyFileReader();
        }

        return propertyFileReader;
    }

    /**
     * Loads properties from the config.properties file.
     *
     * @return The Properties object containing the loaded properties.
     */
    public Properties getProperty() {
        final File file = new File(path, "config.properties");
        final String filePath = file.getAbsolutePath();

        try (final FileInputStream fileInputStream = new FileInputStream(filePath)) {
            properties.load(fileInputStream);
            return properties;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}

