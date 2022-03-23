package com.revature.entities;

import java.util.Random;

public class Enemy extends Combatant {
	private Integer health;
	private Integer strength;
	Random rand = new Random();
	public Enemy() {
		health = 100;
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

	@Override
	public Integer attack() {
		// TODO
	Integer ValueOfAttack = rand.nextInt(20);
	return ValueOfAttack;
	}

	@Override
	public void getAttacked(Integer atkStrength) {
		// TODO
		if(health<atkStrength) {
			health = 0;	
		}
		else{
			health-=atkStrength;
		}	
	}

}
