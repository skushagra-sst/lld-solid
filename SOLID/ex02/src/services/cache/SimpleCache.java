package services.cache;

import models.Frame;

public class SimpleCache implements Cache {

    public void save(Frame last) {
        System.out.println("Cached last frame? " + (last != null));
    }

}
