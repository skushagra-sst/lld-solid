import models.Frame;
import models.Player;
import services.cache.Cache;
import services.cache.SimpleCache;
import services.draw_ui.DrawUI;
import services.draw_ui.SimpleDrawUI;

public class Demo02 {
    public static void main(String[] args) {

        byte[] data = new byte[] { 1, 2, 3, 4 };
        Frame firstFrame = new Frame(data);

        DrawUI drawUI = new SimpleDrawUI();
        Cache cache = new SimpleCache();

        Player p = new Player(drawUI, cache);
        p.play(firstFrame);
    }
}
