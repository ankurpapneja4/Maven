package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

/**
 * Utils
 */
public class Utils {

    private static final Logger log = LoggerFactory.getLogger(Utils.class);

    /**
     * Print Current Date Time
     */
    public void now() {
        log.info("Current Date Time : {}", LocalDateTime.now() );
    }

    /**
     * Convert a string into UPPERCASE
     *
     * @param str Input string value to be converted
     * @return UPPERCASE version of input string
     */
    public String toUpperCase(String str){
        return str.toUpperCase();
    }

    /**
     * Print IP Address Of Host Machine
     * @throws UnknownHostException When Failed To Resolve LocalHost IP
     */
    public void ip() throws UnknownHostException {
        log.info("Host IP : {}", Inet4Address.getLocalHost().getHostAddress());
    }

}
