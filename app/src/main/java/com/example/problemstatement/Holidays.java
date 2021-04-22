package com.example.problemstatement;

import android.widget.ImageView;

public class Holidays {
    private String name;
    private String holidate;
    public Holidays(String name, String holidate){
        this.name = name;
        this.holidate = holidate;
    }
    public String getName(){
        return name;
    }
    public String getDate(){
        return holidate;
    }
}
