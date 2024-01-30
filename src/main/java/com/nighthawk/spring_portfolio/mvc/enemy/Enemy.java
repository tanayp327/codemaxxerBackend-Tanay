package com.nighthawk.spring_portfolio.mvc.enemy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Enemy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique=true)
    private String name;

    private int health;
    private int attack;
    private int defense;
    private int level;
    private int points;

    public Enemy(String name, int health, int attack, int defense, int level, int points) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.level = level;
        this.points = points;
    }

    public static List<Enemy> createInitialData() {
        ArrayList<Enemy> enemies = new ArrayList<>();

        enemies.add(new Enemy("Pixie", 10, 1, 1, 1, 1));
        enemies.add(new Enemy("Troll", 20, 5, 2, 2, 3));
        enemies.add(new Enemy("Golem", 30, 2, 5, 5, 7));
        enemies.add(new Enemy("Goblin", 15, 10, 2, 10, 7));
        enemies.add(new Enemy("Dragon", 50, 20, 10, 15, 15));
        return enemies;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public int setHealth(int health) {
        return this.health = health;
    }

    public int setAttack(int attack) {
        return this.attack = attack;
    }

    public int setDefense(int defense) {
        return this.defense = defense;
    }

    public int setLevel(int level) {
        return this.level = level;
    }

    public int setPoints(int points) {
        return this.points = points;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public int getLevel() {
        return this.level;
    }

    public int getPoints() {
        return this.points;
    }

    public static List<Enemy> init() {
        return createInitialData();
    }
}
