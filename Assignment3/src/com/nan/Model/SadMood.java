package com.nan.Model;

public class SadMood extends MoodyObject {

    protected String getMood(){
        return "I feel sad today!";
    }

    @Override
    public void expressFeelings() {
        System.out.println("'wah''boo hoo''weep''sob''weep'");
    }

    public String toString(){
        return "Observation: Subject cries a lot";

    }

}
