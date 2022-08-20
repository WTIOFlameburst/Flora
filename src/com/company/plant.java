package com.company;

public class plant {

    // Instance Variables
    private int waterLevel;
    private String plantName;
    private String plantType;
    private int plantAge;

    // Constructors
    public plant(){

    }

    public plant (String plantType){
        this.plantType = plantType;
    }

    // Add plant age

    public void addPlantAge(int plantAge){
        this.plantAge = plantAge + 1;
    }

    // Getter Methods

    public double getWaterLevel(){
        return waterLevel;
    }

    public String getPlantName(){
        return getPlantName();
    }

    public String getPlantType(){
        return getPlantType();
    }

    public int getPlantAge(){
        return getPlantAge();
    }

    // Setter Methods

    public void setWaterLevel(int waterLevel){
        this.waterLevel = waterLevel;
    }

    public void setPlantName(String plantName){
        this.plantName = plantName;
    }

    public void setPlantType(String plantType){
        this.plantType = plantType;
    }

    public void setPlantAge(int plantAge){
        this.plantAge = plantAge;
    }
}
