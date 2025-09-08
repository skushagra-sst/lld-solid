package com.example.video;

import java.nio.file.Path;

public class VideoProcessor {

    public static void process(String inFile, String outFile) {
        Decoder dec = new Decoder();
        FilterEngine fe = new FilterEngine();
        Encoder enc = new Encoder();

        Frame[] frames = dec.decode(Path.of(inFile));
        frames = fe.grayscale(frames);
        frames = fe.scale(frames, 0.5);
        // Legacy filter not used due to odd API
        Path out = enc.encode(frames, Path.of(outFile));
        System.out.println("Wrote " + out);
    }

}
