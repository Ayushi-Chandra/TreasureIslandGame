package com.aurionpro.test;

import java.util.Scanner;

public class TreasureIslandGameTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Treasure Island. Your mission is to find the treasure.");
		System.out.println("You find yourself on a path. Do you want to go left or right?");
		String choice1 = scanner.next();

		if (choice1.equalsIgnoreCase("left")) {
			System.out.println("You encounter a hole. Game Over.");
		} else if (choice1.equalsIgnoreCase("right")) {
			System.out.println("You encounter a river. Do you want to swim or do something else?");
			String choice2 = scanner.next();

			if (choice2.equalsIgnoreCase("swim")) {
				System.out.println("You are attacked by trout. Game Over.");
			} else {
				System.out.println("You wait and avoid danger. Good choice!");
				System.out.println("You continue on your path and reach a clearing with three doors.");
				System.out.println("Which door do you choose: Red, Blue, or Yellow?");
				String choice3 = scanner.next();

				if (choice3.equalsIgnoreCase("red")) {
					System.out.println("You are burned by fire. Game Over.");
				} else if (choice3.equalsIgnoreCase("blue")) {
					System.out.println("You are eaten by beasts. Game Over.");
				} else if (choice3.equalsIgnoreCase("yellow")) {
					System.out.println("Congratulations! You win! You found the treasure!");
				} else {
					System.out.println("Invalid choice. Game Over.");
				}
			}
		} else {
			System.out.println("Invalid choice. Game Over.");
		}

		scanner.close();
	}
}
