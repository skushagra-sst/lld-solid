package com.example.render;

import java.util.HashMap;
import java.util.Map;

public class GlyphFactory {

    Map<String, FontStyle> fontMap;

    GlyphFactory() {
        this.fontMap = new HashMap<>();
    }

    public Glyph create(char c, String font, int size, boolean isBold) {

        String key = font + "-" + size + "-" + (isBold ? "bold" : "notBold");

        if (this.fontMap.containsKey(key)) {
            FontStyle fs = this.fontMap.get(key);
            return new Glyph(c, fs);
        }

        FontStyle fs = new FontStyle(font, size, isBold);
        System.out.println("Create fontstyle");

        this.fontMap.put(key, fs);

        Glyph g = new Glyph(c, fs);

        return g;
    }

}
