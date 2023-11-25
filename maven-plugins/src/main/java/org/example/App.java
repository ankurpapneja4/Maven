package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger log = LoggerFactory.getLogger(App.class);

    /**
     * Application Main Method
     *
     * @param args Command Line Arguments
     */
    public static void main( String[] args )
    {

        log.info( "Message : {}","Hello World" );
    }
}