package com.example.report;

import java.nio.file.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "myreport");
        AuditSDK.export(data, Path.of("out"), "myreport");
    }
}
