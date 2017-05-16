package web;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by vikas on 26/02/2017.
 */
public class ReadConfigFile {

    protected static Properties properties = null;
    protected static String congFile = null;


    public static void ReadConfigFile() throws IOException {
        properties = new Properties();
        InputStream input = null;
        String env = System.getProperty("env");
        if(env == null) env = "config";
        if (env.equals("sit")) {
            congFile = System.getProperty("user.dir") + "\\src\\main\\resources\\sit.properties";

        } else {
            congFile = System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties";

        }
        input = new FileInputStream(congFile);
        properties.load(input);
    }

    public static String getPropertyValue(String key) throws IOException {
        ReadConfigFile();
        return properties.getProperty(key);

    }

}
