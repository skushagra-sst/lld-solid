package com.example.config;

import java.nio.file.Path;

public class App {
    public static void main(String[] args) throws Exception {
        String path = args.length > 0 ? args[0] : "app.properties";
        AppSettings object1 = AppSettings.getInstance();
        object1.loadFromFile(Path.of(path));
        System.out.println("object1 app.name=" + object1.get("app.name"));
        System.out.println("object1 instance=" + System.identityHashCode(object1));

        AppSettings object2 = AppSettings.getInstance();
        object2.loadFromFile(Path.of(path));
        System.out.println("object2 app.name=" + object2.get("app.name"));
        System.out.println("object2 instance=" + System.identityHashCode(object2));
    }
}
