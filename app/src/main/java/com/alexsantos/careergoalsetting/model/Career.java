package com.alexsantos.careergoalsetting.model;

import java.util.Date;

/**
 * Created by Alex on 05/06/2017.
 */

public class Career {

    private String description;
    private String date;


    public Career(){

    }

    public void setDescription(String description){
        this.description = description;
    }
    public void setDate(String date){
        this.date = date;
    }

    public String getDescription(){
        return description;
    }

    public String getDate(){

        return date;
    }

}