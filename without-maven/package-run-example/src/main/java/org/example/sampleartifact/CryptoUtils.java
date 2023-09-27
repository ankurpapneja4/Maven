package org.example.sampleartifact;

import java.util.stream.IntStream;

public class CryptoUtils {
 
  /**
   * Convert bytesArray to hexadecimal represntation of bytes
   * 
   */
  public static String[] toHex(byte[] byteArr) {
    
        String[] hex = new String[byteArr.length];
        
        IntStream.range(0, byteArr.length)
            .forEach(   i -> hex[i] = String.format("%02X", byteArr[i]) );
        
        return hex;
  }
}
