package com.vks.sfactory;

public abstract class EnemyShip {

	private String name;
	private Double amtDamage;

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Double getDamage() {
		// TODO Auto-generated method stub
		return amtDamage;
	}

	public void setDamage(Double damage) {
		// TODO Auto-generated method stub
		this.amtDamage = damage;
	}

	public void followHeroShip() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " is following the hero");
	}

	public void displayEnemyShip() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " is on the screen");

	}

	public void enemyShipShoots() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " attacks and does " + getDamage() + " damage to hero");
	}

}
