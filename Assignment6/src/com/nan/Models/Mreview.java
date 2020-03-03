package com.nan.Models;
import java.util.ArrayList;


public class Mreview extends Object implements Comparable{

    private String title;
    private ArrayList<Integer> ratings;

    public Mreview(){
        title = "";
        ratings = new ArrayList<Integer>();
    }

    public Mreview(String ttl){
        this.title = ttl;
        ratings = new ArrayList<Integer>();
    }

    public Mreview(String ttl, int firstRating){
        this.title = ttl;
        this.ratings.add(firstRating);
    }

    public String getTitle(){
        return title;
    }

    public void addRating(int r){
        ratings.add(r);
    }

    public double aveRating(){
        double avg;
        double sumRate =0;
        double size = ratings.size();

        if (ratings.size() ==0){
            avg =0;
        }else{
            for (int i = 0; i < ratings.size(); i++){
                sumRate += ratings.get(i);
            }
            avg = sumRate/size;
        }

        return Math.round(avg*100.00)/100.00;
    }

    public int numRatings(){
        return ratings.size();
    }

    @Override
    public int compareTo(Object obj) {
        Mreview m = (Mreview)obj;

        return title.compareTo(m.title);
    }

    @Override
    public boolean equals(Object obj){
        Mreview m = (Mreview)obj;

        if (title.equals(m.title)){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public String toString(){
        return title + ", average " + aveRating() + " out of " + numRatings() + " ratings";

    }



}
