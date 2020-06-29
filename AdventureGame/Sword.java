import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Sword extends Weapon{

	


	public Sword(String owner, String name, String type){
		super(owner, name, type);
	}

	public Sword(String o, String n, String t){
		owner = o;
		name = n;
		type = t;
	}





/*
	public void setName(String n){
		name = n;
	}

	public String getName(){
		return name;
	}

	public void setType(String t){
		type = t;
	}

	public String getType(){
		return type;
	}

	public String toString(){
		return owner + "\'s weapon is a " + type + " called " + name;
	}
*/
}