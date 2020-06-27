import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class AdventureMain {

	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hello, and welcome to the Adventure Game!");
		System.out.println("You play as the Hero. What is your name, Hero?");
		String name = keyboard.nextLine();

		System.out.println("A Hero needs a weapon! What weapon would you like?");
		System.out.println("Choices:\nSword\nBow and Arrow\nAxe\nWizard Staff\nHammer");
		String weaponType = keyboard.nextLine();

		System.out.println("And what is your weapon called?");
		String weaponName = keyboard.nextLine();

		Character hero = new Character(name);

		System.out.println(hero.getName());

		System.out.println(hero);

		hero.giveWeapon(weaponName, weaponType);

		hero.printWeapon();

	}
}