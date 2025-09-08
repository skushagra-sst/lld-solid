package com.example.report;

import java.nio.file.Path;
import java.util.Map;

public class ReportBundleFacade {

    public static void export(Map<String, Object> data, Path outDir, String fileName) {
        JsonWriter jw = new JsonWriter();
        Zipper z = new Zipper();
        AuditLog log = new AuditLog();
        Path json = jw.write(data, outDir, fileName);
        Path zip = z.zip(json, outDir.resolve(fileName + ".zip"));
        log.log("exported " + zip);
        System.out.println("DONE " + zip);
    }

}
