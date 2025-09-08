package com.example.render;

public class FontStyle {
    private final String font;
    private final int size;
    private final boolean bold;

    public FontStyle(String font, int size, boolean bold) {
        this.font = font;
        this.size = size;
        this.bold = bold;
    }

    public String getFont() {
        return font;
    }

    public int getSize() {
        return size;
    }

    public boolean isBold() {
        return bold;
    }
}
