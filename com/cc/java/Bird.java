package com.cc.java;

public class Bird extends HoneyBee{

    @Override
    public String doYourJob() {
        return "Ich bin aber keine Biene!";
    }

    @Override
    public String fly() {   
        return "I can also fly!";
    }
    
    
}
