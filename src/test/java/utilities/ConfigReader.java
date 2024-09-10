package utilities;

import java.util.Properties;
import java.io.*;
public class ConfigReader {
    static Properties properties;

    static {
        String dosyaYolu = "configuration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {

        String value = properties.getProperty(key);
        return value;
    }

}
