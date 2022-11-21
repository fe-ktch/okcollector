/*
 * File: WordsController.java
 * Created Date: 2021-09-24 10:19:52
 * Author: Sallai Andras
 * Github: https://github.com/andteki
 * -----
 * Last Modified: 2022-11-21
 * Modified By: Sangare F. Felisha
 * -----
 * Copyright (c) 2022 Sangare F. Felisha
 * 
 * GNU GPL v2
 */

package controllers;

import views.MainWindow;

public class WordsController {
    MainWindow mainWindow;

    public WordsController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        this.mainWindow.exitButton.addActionListener(event ->{
            System.exit(0);
        });
    }
}