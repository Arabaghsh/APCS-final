/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Warrior {
	String name;
	int pwr;
	int hp;
	
	public Warrior(String name, int pwr, int hp) {
		this.name = name;
		this.pwr = pwr;
		this.hp = hp;
	}
	public String getName(){
		return name;
	}
	public int getHp(){
		return hp;
	}
	public int getPwr(){
		return pwr;
	}
	public void setHp(int hp){
		this.hp=hp;
	}
	public int basicAttack(int pwr){
		int dmg = (int)((Math.random()*pwr));
		if (dmg < 10){
			dmg+=20;
		}
		System.out.println(this.name + " has attacked for " + dmg);
		return dmg;
	}
	public int ultimateAttack(int pwr){
		int chance = (int)(Math.random()*2);
		if (chance==0){
			int dmg = (int)((Math.random()*pwr));
			if (dmg < 10){
				dmg+=20;
			}
			System.out.println(this.name + " has used his ultimate attack which damaged for " + 2*dmg);
			return 2*dmg;
		}else{
			System.out.println(this.name + " missed his attack");
			return 0;
		}
	}

}
