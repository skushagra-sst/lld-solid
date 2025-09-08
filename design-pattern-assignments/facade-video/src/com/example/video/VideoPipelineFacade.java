package com.example.video;

import java.nio.file.Path;

public class VideoPipelineFacade {

    private Decoder dec;
    private Encoder enc;
    private String inFile;

    VideoPipelineFacade(String infile) {
        this.inFile = infile;
        this.dec = new Decoder();
        this.enc = new Encoder();
    }

    class DecodedProcessorPipeline {

        Frame[] frames;
        private FilterEngine fe;
        private SharpenAdapter sharpenAdapter;

        public DecodedProcessorPipeline(Frame[] frames) {
            this.frames = frames;
            this.fe = new FilterEngine();
            this.sharpenAdapter = new SharpenAdapter();
        }

        public DecodedProcessorPipeline grayscale() {
            System.out.println("Grayscaled");
            this.frames = this.fe.grayscale(this.frames);
            return this;
        }

        public DecodedProcessorPipeline scale(double factor) {
            System.out.println("Scaled");
            this.frames = this.fe.scale(this.frames, factor);
            return this;
        }

        public DecodedProcessorPipeline sharpen(int sharpenStrength) {
            System.out.println("Sharpened");
            this.frames = this.sharpenAdapter.sharpen(this.frames, sharpenStrength);
            return this;
        }

        public Path encode(String out) {
            Path output = Path.of(out);
            Path encoded = VideoPipelineFacade.this.enc.encode(frames, output);
            return encoded;
        }

    }

    public DecodedProcessorPipeline decode() {
        System.out.println("Decoded file");
        Frame[] frames = this.dec.decode(Path.of(inFile));
        DecodedProcessorPipeline decodedProcessorPipeline = new DecodedProcessorPipeline(frames);

        return decodedProcessorPipeline;
    }

    public Path encode(String out) {
        Path output = Path.of(out);
        return output;
    }

}
