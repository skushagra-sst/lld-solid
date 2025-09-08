package com.example.game;

public class GameDemo {
    public static void main(String[] args) {
        MyCharacter base = new BaseCharacter();

        System.out.println("--- Base ---");
        base.move();
        base.attack();

        MyCharacter withSpeedBoost = new SpeedBoost(base);
        System.out.println("\n--- With Speed Boost ---");
        withSpeedBoost.move();
        withSpeedBoost.attack();

        MyCharacter withDamageBoost = new DamageBoost(withSpeedBoost);
        System.out.println("\n--- With Damage Boost ---");
        withDamageBoost.move();
        withDamageBoost.attack();

        MyCharacter withGoldenAura = new GoldenAura(withDamageBoost);
        System.out.println("\n--- With Golden Aura ---");
        withGoldenAura.move();
        withGoldenAura.attack();

    }
}
