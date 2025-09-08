package com.example.video;

import java.nio.file.Path;

public class VideoProcessor {

    public static void process(String inFile, String outFile) {
        Decoder dec = new Decoder();
        FilterEngine fe = new FilterEngine();
        Encoder enc = new Encoder();
        SharpenAdapter sharpenAdapter = new SharpenAdapter();

        Frame[] frames = dec.decode(Path.of(inFile));
        frames = fe.grayscale(frames);
        frames = fe.scale(frames, 0.5);
        frames = sharpenAdapter.sharpen(frames, 0);

        Path out = enc.encode(frames, Path.of(outFile));
        System.out.println("Wrote " + out);
    }

}
