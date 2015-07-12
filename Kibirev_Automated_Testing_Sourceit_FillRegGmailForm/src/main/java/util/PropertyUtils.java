package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtils {

    private PropertyUtils () {}

    public static String getProperty (String prop) {
        Properties properties = new Properties();
        InputStream inputStream;

        inputStream = PropertyUtils.class.getClassLoader().getResourceAsStream("config.properties");
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties.getProperty(prop);
    }
}
