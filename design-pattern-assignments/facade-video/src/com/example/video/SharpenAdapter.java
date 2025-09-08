package com.example.video;

public class SharpenAdapter {

    private final LegacySharpen legacySharpen = new LegacySharpen();

    public Frame[] sharpen(Frame[] frames, int sharpenStrength) {
        String handle = "HANDLE:0";
        handle = legacySharpen.applySharpen(handle, sharpenStrength);
        return frames;
    }

}
