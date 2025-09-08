package com.example.render;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GlyphFactory {

    Map<String, FontStyle> fontMap;

    GlyphFactory() {
        this.fontMap = new ConcurrentHashMap<>();
    }

    public Glyph create(char c, String font, int size, boolean isBold) {

        String key = font + "-" + size + "-" + (isBold ? "bold" : "notBold");

        FontStyle fs = this.fontMap.computeIfAbsent(key, _ -> {
            System.out.println("Create fontstyle");
            return new FontStyle(font, size, isBold);
        });

        return new Glyph(c, fs);
    }

}
