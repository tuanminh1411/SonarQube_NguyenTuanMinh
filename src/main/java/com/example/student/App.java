package com.example.student;

import java.util.logging.Logger;
import java.util.logging.Level;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent("Thai");

        if (logger.isLoggable(Level.INFO)) {
            logger.info("Find Thai: " + manager.findStudent("Thai"));
        }

        manager.removeStudent("Thai");

        if (logger.isLoggable(Level.INFO)) {
            logger.info("Find Thai again: " + manager.findStudent("Thai"));
        }
    }
}
