package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Properties;

import javax.management.RuntimeErrorException;

/**
 * FAULTY "Singleton": public constructor, getInstance() returns a NEW instance
 * each time,
 * not thread-safe, reload allowed anytime, mutable global state,
 * reflection+serialization-friendly.
 */
public class AppSettings implements Serializable {
    private static volatile boolean made = false;
    private final Properties props = new Properties();

    private AppSettings() {
        if (made)
            throw new RuntimeException("Already done");
        made = true;
    }

    private static class Holder {
        static final AppSettings instance = new AppSettings();
    }

    public static AppSettings getInstance() {
        return Holder.instance;
    }

    public synchronized void loadFromFile(Path file) {
        Objects.requireNonNull(file, "file");
        try (InputStream in = Files.newInputStream(file)) {
            props.clear();
            props.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public synchronized String get(String key) {
        return props.getProperty(key);
    }
}
