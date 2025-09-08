package com.example.game;

public class DamageBoost implements MyCharacter {
    private MyCharacter character;

    public DamageBoost(MyCharacter character) {
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
        return character.getSpeed();
    }

    @Override
    public int getDamage() {
        return character.getDamage() + 69;
    }

    @Override
    public String getSprite() {
        return character.getSprite();
    }
}
