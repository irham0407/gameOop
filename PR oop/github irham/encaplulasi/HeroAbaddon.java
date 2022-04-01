package com.encaplulasi;

public class HeroAbaddon {
    String name;
    double attackPower, health;

    HeroAbaddon(String nameInput, double attackInput, double healthInput) {
        this.name = new nameInput;
        this.attackPower = new attackInput;
        this.health = new healthInput;
    }

    void attack(HeroAbaddon enemy) {
        System.out.println("\n" + this.name + "attack" + enemy.name);
        enemy.takeDamage(this.attackPower);
    }

    void takeDamage(double damage) {
        System.out.println(this.name + "receive damage minus from Itl hero " + damage + " -> " + 0.5 * damage);
        this.health = this.health - 0.5 * damage;
    }

    void display() {
        System.out.println("\n" + "Nama : " + this.name);
        System.out.println("Attack Power : " + this.attackPower);
        System.out.println("HP bar : " + this.health);
    }
}
