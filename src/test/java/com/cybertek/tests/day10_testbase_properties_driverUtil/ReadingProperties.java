package com.cybertek.tests.day10_testbase_properties_driverUtil;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file() throws IOException {
        Properties properties = new Properties();
        String path = "configuration.properties";
        // we need to pass the path of the file we want to open in JVM
        FileInputStream file = new FileInputStream(path);

        //we will load the file
        properties.load(file);

        //we read from the file
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));

        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));

        //close the file
        file.close();

    }

    @Test
    public void using_properties_utility_method(){
        System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));
        System.out.println("ConfigurationReader.getProperty(\"smartBearUrl\") = " + ConfigurationReader.getProperty("smartBearUrl"));

    }

}
