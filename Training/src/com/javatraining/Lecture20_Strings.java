package com.javatraining;

import org.apache.log4j.Logger;

public class Lecture20_Strings {
	
	static Logger log = Logger.getLogger(Lecture20_Strings.class.getName());
	
	public static void main(String[] args){  
        long startTime = System.currentTimeMillis();  
        StringBuffer sb = new StringBuffer();  
        String sbString;
        for (int i=0; i<100; i++){  
            sb.append("StringBuffer ");
           }
        sbString = sb.toString();
        log.info(sbString);
        log.info("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
        startTime = System.currentTimeMillis();  
        StringBuilder sb2 = new StringBuilder();  
        for (int i=0; i<100; i++){  
            sb2.append("StringBuilder ");  
        }
        log.info(sb2.toString());
        log.info("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
    }  
}
