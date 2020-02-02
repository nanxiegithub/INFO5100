package com.nan.Model;

public class HappyMood extends MoodyObject {

    protected String getMood(){
        return "I feel happy today!";
    }

    @Override
    public void expressFeelings() {
        System.out.println("hehehe...hahahah...HAHAHAHAHA!");
    }

    public String toString(){
        return "Observation: Subject laughs a lot";

    }
}
