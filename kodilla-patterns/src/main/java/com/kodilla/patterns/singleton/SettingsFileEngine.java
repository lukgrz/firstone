package com.kodilla.patterns.singleton;

public enum SettingsFileEngine {

    INSTANCE;

    private String fileName = "";

    public String getFileName() {
        return fileName;
    }

    public void open(final String fileName) {
        this.fileName = fileName;
        System.out.println("Opening the setting file");
    }

    public void close() {
        this.fileName = "";
        System.out.println("Closing the setting file");
    }

    public boolean loadSettings() {
        System.out.println("Loading settings from file");
        return true;
    }

    public boolean saveSettings() {
        System.out.println("Saveing setting to file");
        return true;
    }
}
