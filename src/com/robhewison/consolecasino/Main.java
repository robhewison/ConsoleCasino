package com.robhewison.consolecasino;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	System.out.println("Welcome to Console Casino!");
	Scanner reader = new Scanner(System.in);
	System.out.println("Pick a heads(1) or tails(2):");
	int userDecision = reader.nextInt();
	reader.close();

	//Creating random generation
    Random rand = new Random();
    int n = rand.nextInt(2);
    n += 1;

    if (userDecision == n) {
        System.out.println("You won!");
    }
    else {
        System.out.println("You lost!");
        }
    }
}
