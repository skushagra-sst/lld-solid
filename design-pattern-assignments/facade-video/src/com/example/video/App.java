package com.example.video;

import java.nio.file.Path;

public class App {
    public static void main(String[] args) {

        VideoPipelineFacade pipeline = new VideoPipelineFacade("in.mp4");

        Path out = pipeline.decode()
                .grayscale()
                .scale(0.5)
                .sharpen(1)
                .encode("out.mp4");

        System.out.println("Encoded Output : " + out.toString());

    }
}
