package com.example.game;

public class SpeedBoost implements MyCharacter {
    private MyCharacter character;

    public SpeedBoost(MyCharacter character) {
        this.character = character;
    }

    @Override
    public void move() {
        System.out.println("Moving at speed " + getSpeed() + " with sprite " + getSprite());
    }

    @Override
    public void attack() {
        System.out.println("Attacking with damage " + getDamage() + " using sprite " + getSprite());
    }

    @Override
    public int getSpeed() {
        return character.getSpeed() + 69;
    }

    @Override
    public int getDamage() {
        return character.getDamage();
    }

    @Override
    public String getSprite() {
        return character.getSprite();
    }
}
