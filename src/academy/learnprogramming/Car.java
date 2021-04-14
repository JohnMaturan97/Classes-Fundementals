package academy.learnprogramming;

import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //Creating a sets methods
    public void setModel(String model) {

        String validModel = model.toLowerCase();
        //Testing model input
        if(validModel.equals("sti")) {
            //Referring the private variables -
            this.model = model;
        } else {
            //print back to console if false
            this.model = "Unknown";
        }


    }
        //Creating a sets and gets method
        public String getModel() {
            return this.model;

    }
}


