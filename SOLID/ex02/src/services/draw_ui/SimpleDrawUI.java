package services.draw_ui;

public class SimpleDrawUI implements DrawUI {

    public void draw(byte[] fileBytes) {
        System.out.println("\u25B6 Playing " + fileBytes.length + " bytes");
    }
}
