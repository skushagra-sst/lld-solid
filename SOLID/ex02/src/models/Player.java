package models;

import services.cache.Cache;
import services.draw_ui.DrawUI;

public class Player {

    private Frame last;
    private DrawUI drawUI;
    private Cache cache;

    public Player(DrawUI drawUI, Cache cache) {
        this.drawUI = drawUI;
        this.cache = cache;
    }

    public Frame getLastFrame() {
        return this.last;
    }

    public void setLastFrame(Frame last) {
        this.last = last;
    }

    public void play(Frame frame) {

        this.setLastFrame(frame);

        // draw UI
        this.drawUI.draw(frame.getData());

        // cache
        this.cache.save(last);
    }
}