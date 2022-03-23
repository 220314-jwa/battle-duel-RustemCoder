package com.revature.entities;

import java.util.Random;

public class Hero extends Combatant implements Healer, Attacker {
	private String name;
	private Integer maxHealth;
	private Integer health;
	private Integer strength;
	private String specialPower;
	private Integer levelOfPower;
	public Hero() {
		name = "Hero";
		maxHealth = 100;
		health = 100;
		strength = 20;
		specialPower = "Fireball";
		levelOfPower = 0;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getMaxHealth() {
		return maxHealth;
	}
	
	public void setMaxHealth(Integer maxHealth) {
		this.maxHealth = maxHealth;
	}
	
	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}
	
	public String getSpecialPower() {
		return specialPower;
	}

	public void setSpecialPower(String specialPower) {
		this.specialPower = specialPower;
	}
	Random rand = new Random();
	public void heal() {
		// TODO
		Integer ValueOfHealing = rand.nextInt(20);
		health+=ValueOfHealing;
	}
	
	@Override
	public Integer attack() {
		// TODO
		levelOfPower+=1;
		Integer ValueOfAttack = rand.nextInt(20);
		return ValueOfAttack;
	}

	@Override
	public void getAttacked(Integer atkStrength) {
		if(health<atkStrength) {
			health = 0;	
		}
		else{
			health-=atkStrength;
		}	
	}
	
	@Override
	public Integer specialAttack() {
		// TODO
		levelOfPower-=2;
		strength-=1;
		Integer ValueOfAttack = rand.nextInt(10);
		return strength*ValueOfAttack;
	}
	
	
	public Integer getLevelOfPower() {
		return levelOfPower;
	}
	public void setLevelOfPower(Integer levelOfPower) {
		this.levelOfPower-=levelOfPower;
	}
	@Override
	public String toString() {
		return "Hero [name=" + name + ", maxHealth=" + maxHealth + ", health=" + health + ", strength=" + strength
				+ "]";
	}
	
}
