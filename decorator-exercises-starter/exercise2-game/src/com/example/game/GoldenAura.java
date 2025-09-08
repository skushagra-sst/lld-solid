package com.example.game;

public class GoldenAura implements MyCharacter {
    private MyCharacter character;

    public GoldenAura(MyCharacter character) {
        this.character = character;
    }

    @Override
    public void move() {
        System.out.println("A golden aura surrounds the character as it moves.");
        character.move();
    }

    @Override
    public void attack() {
        System.out.println("The character's attack glows with a golden light.");
        character.attack();
    }

    @Override
    public int getSpeed() {
        return character.getSpeed() + 1; // Small speed buff
    }

    @Override
    public int getDamage() {
        return character.getDamage() + 2; // Small damage buff
    }

    @Override
    public String getSprite() {
        return "Golden " + character.getSprite(); // Change sprite to indicate golden aura
    }

}
