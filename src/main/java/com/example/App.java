package com.example;

import com.example.data.DataCreator;
import com.example.ui.AppRunner;

public class App {

    public static void main(String[] args) {
        DataCreator dataCreator = new DataCreator();
        dataCreator.createDataAndFillDB();
        AppRunner app = new AppRunner();
        app.run();
    }
}
