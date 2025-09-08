package com.example.render;

public class Renderer {

    private GlyphFactory gf;

    public Renderer() {
        this.gf = new GlyphFactory();
    }

    public int render(String text) {
        int cost = 0;
        for (char c : text.toCharArray()) {
            Glyph g = gf.create(c, text, cost, (c % 7 == 0));
            cost += g.drawCost();
        }
        return cost;
    }

}
