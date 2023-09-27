package org.example.sampleartifact;

import java.util.Arrays;

public class HelloWorld {
  public static void main(String[] args){
    
    System.out.println( 
          Arrays.toString(  CryptoUtils.toHex( new byte[]{10, 11, 12, 13, 14, 15, 16, 17, 18} )  ));
  
  }
}
