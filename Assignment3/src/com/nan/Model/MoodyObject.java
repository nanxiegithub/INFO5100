package com.nan.Model;

public abstract class MoodyObject {

    protected abstract String getMood();

    protected abstract void expressFeelings();

    public void queryMood(){
        System.out.println(getMood());
    }






}
