package com.example.render;

public class Glyph {
    // Smell: style stored per instance → not memory efficient
    private final char ch;
    private final FontStyle fs;

    public Glyph(char ch, FontStyle fs) {
        this.ch = ch;
        this.fs = fs;
    }

    public int drawCost() {
        return fs.getSize() + (fs.isBold() ? 10 : 0);
    }

    public char getCh() {
        return ch;
    }

    public String getFont() {
        return fs.getFont();
    }

    public int getSize() {
        return fs.getSize();
    }

    public boolean isBold() {
        return fs.isBold();
    }
}
