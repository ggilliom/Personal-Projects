import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Character {

	private String name;
	private Weapon weapon;

	public Character(){
		name = "Nobody";
	}

	public Character(String n){
		name = n;
	}

	public void setName(String n){
		name = n;
	}

	public String getName(){
		return name;
	}

	public void giveWeapon(String weaponName, String weaponType){
		weapon = new Weapon(name, weaponName, weaponType);
	}

	public void printWeapon(){
		System.out.println(weapon);
	}

	public String toString(){
		return "You are " + name + ", a Character in this game.";
	}

}