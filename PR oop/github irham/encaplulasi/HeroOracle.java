package com.encaplulasi;

public class HeroOracle extends HeroAbaddon {
    String type = "Intelegent"

    HeroOracle(String NameInput, double attackInput, double healthInput) {
        super(NameInput, attackInput, healthInput);
    }

    @Override
    void display() {
        super display();
        System.out.println("Type : " + this.type);
    }

    @Override
    void takeDamage(double damage) {
        System.out.println(this.name + " receive plus damage from STR hero " + damage + " -> " + 0.5 * damage);
        this.health = this.health - 1.5 * damage;
    }
}
