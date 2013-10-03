package com.home.designpatterns.behavioral.chainofresponsibility.version2.code;

public class XmlParser extends Parser {

    public XmlParser(Parser successor) {
        super(successor);
    }

    @Override
    protected String getFileFormat() {
        return ".xml";
    }
    
    @Override
    protected void parseFile(String fileName) {
        System.out.println(String.format("%s is parsing the file [%s]...", getClass().getSimpleName(), fileName));
        System.out.println();
    }
}
