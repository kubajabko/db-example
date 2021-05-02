package com.example;

import com.example.data.DataCreator;

public class App {

    //private boolean isOn = true;

    public static void main(String[] args) {
        DataCreator dataCreator = new DataCreator();
        dataCreator.createDataAndFillDB();
    }
}
