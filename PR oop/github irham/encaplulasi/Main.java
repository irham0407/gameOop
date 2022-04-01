package com.encaplulasi;

public class Main {
    public static void name(String[] args) {
        HeroAbaddon char1 = new HeroAbaddon("Abaddon", 10, 200);
        HeroOracle char2 = new HeroOracle("Oracle", 30, 100);

        char1.display();
        char2.display();

        char1.attack(char2);
        char2.attack(char1);

        char1.display();
        char2.display();
    }
}