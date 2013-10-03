package com.home.designpatterns.behavioral.chainofresponsibility.version2.code;


public abstract class Parser {
    private Parser successor;
    
    public Parser() {}
    
    public Parser(Parser successor) {
        this.successor = successor;
    }
    
    public void parse(String fileName) {
        String className = this.getClass().getSimpleName();
        
        if (fileName != null && fileName.contains(getFileFormat())) {
            parseFile(fileName);
        } else {
            System.out.println(String.format("%s doesn't support [%s] files!", className, fileName));
            if (successor != null) {
                successor.parse(fileName);
            } else {
                System.err.println(String.format("File can't be parsed due to lack of appropriate perser in chain: [%s]", fileName));
                System.out.println();
            }
        }
    }
    
    protected abstract String getFileFormat();
    protected abstract void parseFile(String fileName);
}
