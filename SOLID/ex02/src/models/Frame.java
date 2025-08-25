package models;

public class Frame {

    private byte[] data;

    public Frame(byte[] d) {
        this.data = d;
    }

    public void setData(byte[] d) {
        this.data = d;
    }

    public byte[] getData() {
        return this.data;
    }

}
