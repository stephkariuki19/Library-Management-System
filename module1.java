package com.amigos;


public class module1 {
   String name,uni_id,date;
   float sem;
    //getter methods
public String getUni_id(){
    return uni_id;
    }
    public String getName(){
        return name;
    }


    public String getDate(){
        return date;
    }

    public float getSem(){
        return sem;
    }

//setter methods
public void setName(String name){
    this.name=name;
}
    public void setUni_id(String uni_id){
        this.uni_id=uni_id;
    }
    public void setDate(String date){
        this.date=date;
    }


    public void setSem(float sem){
        this.sem=sem;
    }


}
