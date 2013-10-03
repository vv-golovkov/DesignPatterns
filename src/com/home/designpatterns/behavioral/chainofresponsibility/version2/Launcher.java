package com.home.designpatterns.behavioral.chainofresponsibility.version2;

import java.util.Arrays;
import java.util.List;

import com.home.designpatterns.behavioral.chainofresponsibility.version2.code.CsvParser;
import com.home.designpatterns.behavioral.chainofresponsibility.version2.code.JsonParser;
import com.home.designpatterns.behavioral.chainofresponsibility.version2.code.Parser;
import com.home.designpatterns.behavioral.chainofresponsibility.version2.code.TextParser;
import com.home.designpatterns.behavioral.chainofresponsibility.version2.code.XmlParser;

public class Launcher {
    
    public static void main(String[] args) {
        List<String> fileNames = getFileNames();
        
        Parser parser = setUpChainSequence();
        for (String fileName : fileNames) {
            parser.parse(fileName);
        }
    }
    
    private static Parser setUpChainSequence() {
        Parser textParser = new TextParser();
        Parser xmlParser = new XmlParser(textParser);
        Parser csvParser = new CsvParser(xmlParser);
        Parser jsonParser = new JsonParser(csvParser);
        
        return jsonParser;
    }
    
    private static List<String> getFileNames() {
        String[] files = new String[] {"hello.csv", "hello.dat", "hello.xml", "hello.json", "hello.txt"};
        return Arrays.asList(files);
    }
}
