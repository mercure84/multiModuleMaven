package com.chatons;

import java.io.*;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World of Chatons :))!" );

        Properties vProp = new Properties();
        InputStream vInputStream = null;
        try {
            vInputStream = App.class.getResourceAsStream("/info.properties");
            vProp.load(vInputStream);

        } finally {
            if (vInputStream != null){
                vInputStream.close();
            }
        }
        System.out.println("Application version : " + vProp.getProperty("application.version", "?"));




}

}
