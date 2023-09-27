package org.example.sampleartifact;
import org.apache.commons.lang3.StringUtils;

public class HelloWorld {
  
  public static void main( String[] args ){
    int[] idList = new int[]{23, 45 , 56};
    System.out.println( StringUtils.join( idList, ',')  );
  }
}
