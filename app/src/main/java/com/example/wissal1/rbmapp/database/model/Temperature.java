package com.example.wissal1.rbmapp.database.model;

/**
 * Created by USER on 30/03/2018.
 */

public class Temperature {


    public static final String TABLE_NAME = "temperature";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NUMRUCHE = "numruche";
    public static final String COLUMN_VALEURTEMPERATURE = "valeurtemperature";
    public static final String COLUMN_DATE   = "date";
    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_NUMRUCHE + " TEXT,"
                    + COLUMN_VALEURTEMPERATURE + " TEXT ,"+COLUMN_DATE+"DATETIME DEFAULT CURRENT_DATE"
                    + ")";



    private int id ;
    private String numruche ;
    private String valeurTemperature;
    private String date;
    public Temperature(){}
    public Temperature(int id ,String numruche,String valeurTemperature,String date){
        this.id=id ;
        this.numruche=numruche;
        this.valeurTemperature=valeurTemperature;
        this.date=date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumruche() {
        return numruche;
    }

    public void setNumruche(String numruche) {
        this.numruche = numruche;
    }

    public String getValeurTemperature() {
        return valeurTemperature;
    }

    public void setValeurTemperature(String valeurTemperature) {
        this.valeurTemperature = valeurTemperature;
    }

    public String getDate() {
        return date;
    }

    public  void setDate(String date) {
        this.date = date;
    }

}
