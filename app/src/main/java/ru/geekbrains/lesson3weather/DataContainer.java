package ru.geekbrains.lesson3weather;

import java.io.Serializable;

public class DataContainer implements Serializable {

    private String city1;
    private static DataContainer instance;

    private DataContainer() {}

    static DataContainer getInstance() {
        if(instance == null) {
            instance = new DataContainer();
        }

        return instance;
    }
    public void setCity1 (String city1) {
        this.city1 =city1;
    }
    public String getCity() {
        return city1;
    }


}

