package com.nan;

import com.nan.Model.HappyMood;
import com.nan.Model.Psychiatrist;
import com.nan.Model.SadMood;

public class Question2Driver {

    public static void main(String[] args) {
        // write your code here

        SadMood Andy = new SadMood();
        HappyMood WYC = new HappyMood();
        Psychiatrist NX = new Psychiatrist();

        NX.examine(Andy);
        NX.observe(Andy);
        NX.examine(WYC);
        NX.observe(WYC);

    }
}
