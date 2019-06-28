package com.vks.sfactory;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {

		EnemyShipFactory shipFactory = new EnemyShipFactory();

		EnemyShip theEnemy;

		//Scanner userInput = new Scanner(System.in);

		//System.out.print("What type of ship? (U / R / B)");

		theEnemy = shipFactory.makeEnemyShip("r");

		doStuffEnemy(theEnemy);
		
		
		
	}

	private static void doStuffEnemy(EnemyShip anEnemyShip) {
		// TODO Auto-generated method stub
		anEnemyShip.displayEnemyShip();
		anEnemyShip.enemyShipShoots();
		anEnemyShip.followHeroShip();
	}

}
